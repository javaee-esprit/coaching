package services;

import java.util.List;

import javax.ejb.Remote;


import domain.Employee;
import domain.User;

@Remote
public interface UserServiceRemote {
	
	void create(User user);
	User authenticate(String login, String password);
	List<Employee> findEmployees();
	List<User> findUsers();
}
