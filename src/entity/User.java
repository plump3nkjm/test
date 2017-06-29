package entity;

public class User {
	private Integer userId;
	private String userName;
	private String telNo;

	public User() {
		super();
	}

	public User(Integer userId, String userName, String telNo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.telNo = telNo;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public Integer getUserId() {
		return userId;
	}
	public String getTelNo() {
		return telNo;
	}
	public String getUserName() {
		return userName;
	}

}
