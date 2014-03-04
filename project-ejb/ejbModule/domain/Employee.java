package domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
public class Employee extends User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String email;

	public Employee() {
	}   
	

	public Employee(String login, String password, String email) {
		super(login, password);
		this.email = email;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
}
