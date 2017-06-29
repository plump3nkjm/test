package jp.co.axiz.web.form;

public class InsertForm {

	private String date;
	private String event;
	private String Cdate;
	private String Cevent;

	public String getCdate() {
		return Cdate;
	}

	public void setCdate(String cdate) {
		Cdate = cdate;
	}

	public String getCevent() {
		return Cevent;
	}

	public void setCevent(String cevent) {
		Cevent = cevent;
	}

	public InsertForm() {
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

}