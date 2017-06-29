package jp.co.axiz.web.dto;

import org.springframework.stereotype.Component;

@Component
public class scheduleDto {

	private String date;
	private String event;

	public scheduleDto(){
		super();
		}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public scheduleDto(String date) {
		this.date = date;


	}
	public scheduleDto(String date, String event) {
		this.date = date;
		this.event = event;
	}
}
