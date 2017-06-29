package jp.co.axiz.web.dto;

import org.springframework.stereotype.Component;

@Component
public class reserveDto {

	private String date;
	private String user_name;
	private String event;
	private String ticket;

	public reserveDto(){
		super();
	}
	public reserveDto(String date, String user_name, String event, String ticket){
		this.date = date;
		this.user_name = user_name;
		this.event = event;
		this.ticket = ticket;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
}
