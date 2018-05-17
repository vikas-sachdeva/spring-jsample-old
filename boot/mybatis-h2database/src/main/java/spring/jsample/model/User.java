package spring.jsample.model;

public class User {

	private String userId;

	private String password;

	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User : {  'userId' : ").append(userId).append(", 'password' : ").append(password).append(" }");
		return builder.toString();
	}

}
