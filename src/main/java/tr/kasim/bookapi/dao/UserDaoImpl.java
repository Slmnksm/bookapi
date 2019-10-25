package tr.kasim.bookapi.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tr.kasim.bookapi.model.User;

/**
*
* @author SelmanKasim
*/
@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Long registerUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		return user.getId();
	}

	@Override
	public User getUser(Long id) {
		User user = sessionFactory.getCurrentSession().get(User.class,id);
		
		if(user==null) {
			return null;
		}
		
		return user;
	} 
	
	@Override
	public List<User> listUser() {
		List<User> list = sessionFactory.getCurrentSession().createQuery("from User").list();
		return list;
	}

	@Override
	public void updateUser(Long id, User user) {
		Session session = sessionFactory.getCurrentSession();
	    User oldUser = session.byId(User.class).load(id);
	    oldUser.setUserName(user.getUserName());
	    oldUser.setPassword(user.getPassword());
	    oldUser.seteMail(user.geteMail());
	    oldUser.setModificationDate(new Date());
	    session.flush();		
	}

	@Override
	public void deleteUser(Long id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.byId(User.class).load(id);
		session.delete(user);
	}

	@Override
	public String login(String userName, String password) {
       
		try {
			
			User user = (User) sessionFactory.getCurrentSession()
					.createQuery("select u from User u where u.userName =:userName")
					.setParameter("userName", userName).uniqueResult();
		        
			if(user.getPassword().equals(password)) {
				return "Login Successful";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Login Failed!";
		}

		return "Login Failed!";
	}

	
	
	
	
}
