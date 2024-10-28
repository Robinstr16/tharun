package adv.java;

public class AppUsers {

	private long Id;
	private String UserName;
	private String password;
	public AppUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppUsers(long id, String userName, String password) {
		super();
		Id = id;
		UserName = userName;
		this.password = password;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AppUsers [Id=" + Id + ", UserName=" + UserName + ", password=" + password + "]";
	}
	

}
