package beans;

import services.UserServiceLocal;
import domain.Admin;
import domain.Employee;
import domain.User;

public class AuthBean {
	
	private UserServiceLocal local;
	
	private String login;
	private String password;
	
	
	
	public AuthBean(UserServiceLocal local, String login, String password) {
		this.local = local;
		this.login = login;
		this.password = password;
	}

	public String doLogin(){
		String navigateTo = null;
		User user =  local.authenticate(login, password);
		
		if (user != null) {
			System.out.print("ACCESS GRANTED");
			
			if(user instanceof Admin){
				System.out.println(" AS ADMIN");
				navigateTo = "/home.xhtml";
				
			}else if (user instanceof Employee) {
				System.out.println(" AS EMPLOYEE");
			}else if (user instanceof  User) {
				System.out.println(" AS USER");
			}
				
			
		}else{
			System.out.println("ACCESS DENIED");
			navigateTo = "/error.xhtml";
			
		}
		return navigateTo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
