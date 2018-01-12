package syntel.health.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import syntel.health.community.dao.UserDao;
import syntel.health.community.domain.UserDomain;
import syntel.health.community.model.Patients;
import syntel.health.community.model.User;




/**
 * 
 * @author Robert Jenifer Vilbert
 * UserServiceImpl.java
 */
@Service
public class UserServiceImpl implements UserSevice{
	
	@Autowired
	private UserDao userDao;

	@Override
	public User getById(long id) {
		return userDao.getById(id);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User getByEmail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public void create(User user) {
		userDao.create(user);
	}

	@Override
	public UserDomain getAutherization(User user) {
		return userDao.getAutherization(user);
		
	}

	@Override
	public UserDomain patientSubscribe(Patients patients) {
		// TODO Auto-generated method stub
		return userDao.patientSubscribe(patients);
	}

}
