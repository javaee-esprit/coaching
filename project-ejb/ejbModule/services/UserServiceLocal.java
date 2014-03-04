package services;

import java.util.List;

import javax.ejb.Local;




import domain.Employee;
import domain.User;

@Local
public interface UserServiceLocal {
	
	void create(User user);
	User authenticate(String login, String password);
	List<Employee> findEmployees();
	List<User> findUsers();
}
