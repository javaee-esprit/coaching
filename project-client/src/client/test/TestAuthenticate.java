package client.test;

import client.delegate.UserServiceDelegate;
import domain.Admin;
import domain.Employee;
import domain.User;

public class TestAuthenticate {
	
	public static void main(String[] args) {
		User user =  UserServiceDelegate.authenticate("jean", "azert");
		
		if (user != null) {
			System.out.print("ACCESS GRANTED");
			if(user instanceof Admin){
				System.out.println(" AS ADMIN");
			}else if (user instanceof Employee) {
				System.out.println(" AS EMPLOYEE");
			}else if (user instanceof  User) {
				System.out.println(" AS USER");
			}
				
			
		}else{
			System.out.println("ACCESS DENIED");
		}
	}

}
