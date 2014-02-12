package domain;

import domain.User;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Admin extends User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int adminLevel;

	public Admin() {
	} 
	
	
	public Admin(String login, String password, int adminLevel) {
		super(login, password);
		this.adminLevel = adminLevel;
	}


	public int getAdminLevel() {
		return this.adminLevel;
	}

	public void setAdminLevel(int adminLevel) {
		this.adminLevel = adminLevel;
	}
   
}
