package jp.co.axiz.web.form;

import org.springframework.stereotype.Component;

//Formの内容を格納するクラス
@Component
public class Form {

	private String id;
	private String pass;
	private String aid;
	private String apass;

	public Form() {
		super();
	}

	public String getAid() {
		return aid;
	}

	public String getApass() {
		return apass;
	}

	public String getId() {
		return id;
	}

	public String getPass() {
		return pass;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public void setApass(String apass) {
		this.apass = apass;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
