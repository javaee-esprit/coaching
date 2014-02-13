package client.test;

import client.delegate.UserServiceDelegate;
import domain.Admin;
import domain.Employee;

public class CreateSomeUsers {
	
	public static void main(String[] args) {
		
		Employee jean = new Employee("jean", "azerty", "jean@world.fr");
		Employee john = new Employee("john", "qwerty", "john@world.co.uk");
		
		Admin admin = new Admin("system", "system", 1);
		
		UserServiceDelegate.create(jean);
		UserServiceDelegate.create(john);
		UserServiceDelegate.create(admin);
		
	}

}
