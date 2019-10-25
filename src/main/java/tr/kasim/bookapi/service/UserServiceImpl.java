package tr.kasim.bookapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.kasim.bookapi.dao.UserDao;
import tr.kasim.bookapi.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public Long registerUser(User user) {
		return userDao.registerUser(user);
	}

	@Override
	@Transactional
	public User getUser(Long id) {
		User user = userDao.getUser(id);
		return user;
	}

	@Override
	@Transactional
	public List<User> listUser() {
		List<User > userList = userDao.listUser();
		return userList;
	}

	@Override
	 @Transactional
	public void updateUser(Long id, User user) {
		userDao.updateUser(id, user);
	}

	@Override
	@Transactional
	public void deleteUser(Long id) {
		userDao.deleteUser(id);
	}

	@Override
	@Transactional
	public String login(String userName, String password) {
		return userDao.login(userName, password);
	}

}
