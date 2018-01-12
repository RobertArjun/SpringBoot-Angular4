package syntel.health.community.dao;

import syntel.health.community.domain.UserDomain;
import syntel.health.community.model.Patients;
import syntel.health.community.model.User;

/**
 * 
 * @author Robert Jenifer Vilbert
 * UserDao.java
 */
public interface UserDao {

	public User getById(long id);

	public void update(User user);

	public User getByEmail(String email);

	public void delete(User user);

	public void create(User user);
	public UserDomain getAutherization(User user);

	public UserDomain patientSubscribe(Patients patients);

}
