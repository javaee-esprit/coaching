package client.session;

import domain.User;

public class Session {
	
	private User user;
	
	private static Session instance;
	
	private Session() {
	}

	public static Session getInstance() {
		if (instance == null ) {
			instance = new Session();
		}
		return instance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	

}
