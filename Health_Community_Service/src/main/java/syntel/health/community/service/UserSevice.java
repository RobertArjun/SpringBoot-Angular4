package syntel.health.community.service;

import syntel.health.community.domain.UserDomain;
import syntel.health.community.model.Patients;
import syntel.health.community.model.User;

/**
 * 
 * @author Robert Jenifer Vilbert
 * Mar 27, 2017 12:04:17 AM 12:04:17 AM 
 * UserSevice.java
 */
public interface UserSevice {

	public User getById(long id);

	public void update(User user);

	public User getByEmail(String email);

	public void delete(User user);

	public void create(User user);

	public UserDomain getAutherization(User user);

	public UserDomain patientSubscribe(Patients patients);

}
