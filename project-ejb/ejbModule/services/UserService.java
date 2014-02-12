package services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import domain.Employee;
import domain.User;

@Stateless
public class UserService implements UserServiceRemote {
	
	@PersistenceContext
	private EntityManager em;

    public UserService() {
    }

	public void create(User user) {
		em.persist(user);
	}

	public User authenticate(String login, String password) {
		User found = null;
		String jpql = "select u from User u where u.login=:x and u.password=:y";
		Query query = em.createQuery(jpql);
		query.setParameter("x", login);
		query.setParameter("y", password);
		try{
			found = (User) query.getSingleResult();
		}catch(Exception e){
			Logger.getLogger(UserService.class.getName()).log(Level.WARNING,"failed auth for login : " + login);
		}
		return found;
	}

	public List<Employee> findEmployees() {
		return em.createQuery("select emp from Employee emp", Employee.class).getResultList();
	}

	public List<User> findUsers() {
		return em.createQuery("select u from User u", User.class).getResultList();
	}

}
