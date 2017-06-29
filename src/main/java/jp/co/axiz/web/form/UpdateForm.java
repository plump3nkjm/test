package jp.co.axiz.web.form;

public class UpdateForm {

	private String date;
	private String event;
	private String ndate;
	private String nevent;

	public String getNdate() {
		return ndate;
	}

	public void setNdate(String ndate) {
		this.ndate = ndate;
	}

	public String getNevent() {
		return nevent;
	}

	public void setNevent(String nevent) {
		this.nevent = nevent;
	}

	private String newdate;
	private String newevent;

	public String getNewdate() {
		return newdate;
	}

	public void setNewdate(String newdate) {
		this.newdate = newdate;
	}

	public String getNewevent() {
		return newevent;
	}

	public void setNewevent(String newevent) {
		this.newevent = newevent;
	}

	public UpdateForm() {
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