package jp.co.axiz.web.dto;

import org.springframework.stereotype.Component;

@Component
public class userinfoDto {
	private String user_id;
	private String user_name;
	private String password;

	public userinfoDto() {
		super();
	}

	public userinfoDto(String user_id, String user_name, String password) {
		this.user_id = user_id;
		this.user_id = user_name;
		this.user_id = password;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
