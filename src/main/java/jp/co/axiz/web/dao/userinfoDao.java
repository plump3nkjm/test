package jp.co.axiz.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.dto.userinfoDto;

@Repository
public class userinfoDao {

	@Autowired
	private JdbcTemplate jdbc;
	@Autowired
	private userinfoDto dto2;

	public List<userinfoDto> login(String id, String pass) {

		ArrayList<userinfoDto> list = new ArrayList<userinfoDto>();
		jdbc.query("SELECT * FROM user_info", new BeanPropertyRowMapper<userinfoDto>(userinfoDto.class) {
			public userinfoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				if (rs.getString("user_id").equals(id) && rs.getString("password").equals(pass)) {

						userinfoDto a = new userinfoDto(rs.getString("user_id"), rs.getString("user_name"),
								rs.getString("password"));
						list.add(a);

					}


				return dto2;

			}
		});
		return list;
	}

	public  void newregister(int id,String name,String pass){
		jdbc.update("INSERT INTO user_info (user_id,user_name,password) VALUES (?, ?, ?)", id,name,pass);
	}

	public List<userinfoDto> idcheck(String id) {

		ArrayList<userinfoDto> list = new ArrayList<userinfoDto>();
		jdbc.query("SELECT * FROM user_info", new BeanPropertyRowMapper<userinfoDto>(userinfoDto.class) {
			public userinfoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				if (rs.getString("user_id").equals(id)) {

						userinfoDto a = new userinfoDto(rs.getString("user_id"), rs.getString("user_name"),
								rs.getString("password"));
						list.add(a);

					}


				return dto2;

			}
		});
		return list;
	}
}
