package jp.co.axiz.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.dto.scheduleDto;

@Repository
public class scheduleDao {
	@Autowired
	private JdbcTemplate jdbc;
	@Autowired
	private scheduleDto sdto;

	// 検索メソッド
		public List<scheduleDto> select(String date) {
			ArrayList<scheduleDto> list = new ArrayList<scheduleDto>();

			jdbc.query("SELECT * FROM schedule ORDER BY date",
					new BeanPropertyRowMapper<scheduleDto>(scheduleDto.class) {
						public scheduleDto mapRow(ResultSet rs, int rowNum) throws SQLException {

								if (date.equals(rs.getString("date")) || (date.equals(""))) {
									scheduleDto a = new scheduleDto(rs.getString("date"), rs.getString("event"));
									list.add(a);


							}
							return sdto;

						}

					});

			list.stream().forEach(System.out::println);
			return list;

		}
//登録メソッド
		public void register(String date, String event) {

			jdbc.update("INSERT INTO schedule (date,event) VALUES (?, ?)", date,event);

		}

		// idを基にカラム検索
		public scheduleDto syutoku(String date) {

			jdbc.query("SELECT * FROM schedule", new BeanPropertyRowMapper<scheduleDto>(scheduleDto.class) {

				public scheduleDto mapRow(ResultSet rs, int rowNum) throws SQLException {
					while (rs.next()) {
						if (date .equals( rs.getString("date"))) {
							sdto = new scheduleDto(rs.getString("date"), rs.getString("event"));

							return sdto;
						}
					}
					return sdto;

				}
			});
			return sdto;
		}

//削除
		public void delete(String date){
			jdbc.update("DELETE FROM schedule WHERE date=?", date);
		}
		//更新
		public void update(String date ,String event){
			jdbc.update("UPDATE schedule SET  event=? WHERE date=?",event,date);

		}
}
