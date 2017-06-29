package jp.co.axiz.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.dto.reserveDto;
@Repository
public class reserveDao {

	@Autowired
	private JdbcTemplate jdbc;
	@Autowired
	private reserveDto rdto;

	public void reserveregister(String date, String event, String name, String ticket) {

		jdbc.update("INSERT INTO reserve (date,event,user_name,ticket) VALUES (?,?,?,?)", date,event,name,ticket);

	}

	public List<reserveDto> select(String date) {
		ArrayList<reserveDto> list = new ArrayList<reserveDto>();

		jdbc.query("SELECT * FROM reserve ORDER BY date",
				new BeanPropertyRowMapper<reserveDto>(reserveDto.class) {
					public reserveDto mapRow(ResultSet rs, int rowNum) throws SQLException {

							if (date.equals(rs.getString("date")) || (date.equals(""))) {
								reserveDto a = new reserveDto(rs.getString("date"), rs.getString("event"),rs.getString("ticket"),rs.getString("user_name"));
								list.add(a);

							}

						return rdto;

					}

				});

		list.stream().forEach(System.out::println);
		return list;

	}
}
