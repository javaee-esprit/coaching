package client.delegate;

import java.util.List;

import client.locator.ServiceLocator;

import domain.Employee;
import domain.User;
import services.UserServiceRemote;

public class UserServiceDelegate  {

	private static final String jndiName = "ejb:project/project-ejb/UserService!services.UserServiceRemote";
	
	public static UserServiceRemote getProxy(){
		return (UserServiceRemote) ServiceLocator.getInstance().getProxy(jndiName);
	}
	
	public static void create(User user) {
		getProxy().create(user);
	}

	public static User authenticate(String login, String password) {
		return getProxy().authenticate(login, password);
	}

	public static List<Employee> findEmployees() {
		return getProxy().findEmployees();
	}

	public static List<User> findUsers() {
		return getProxy().findUsers();
	}

}
