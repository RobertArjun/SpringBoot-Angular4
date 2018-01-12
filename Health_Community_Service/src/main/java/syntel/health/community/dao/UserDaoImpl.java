package syntel.health.community.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import syntel.health.community.domain.UserDomain;
import syntel.health.community.model.Doctors;
import syntel.health.community.model.Patients;
import syntel.health.community.model.User;

/**
 * 
 * @author Robert Jenifer Vilbert Mar 27, 2017 12:05:38 AM 12:05:38 AM
 *         UserDaoImpl.java
 */
@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	// An EntityManager will be automatically injected from entityManagerFactory
	// setup on DatabaseConfig class.
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Save the user in the database.
	 */
	public void create(User user) {
		entityManager.persist(user);
		return;
	}

	/**
	 * Delete the user from the database.
	 */
	public void delete(User user) {
		if (entityManager.contains(user))
			entityManager.remove(user);
		else
			entityManager.remove(entityManager.merge(user));
		return;
	}

	/**
	 * Return all the users stored in the database.
	 */
	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		return entityManager.createQuery("from User").getResultList();
	}

	/**
	 * Return the user having the passed email.
	 */
	public User getByEmail(String email) {
		return (User) entityManager.createQuery("from User where email = :email").setParameter("email", email)
				.getSingleResult();
	}

	/**
	 * Return the user having the passed id.
	 */
	public User getById(long id) {
		return entityManager.find(User.class, id);
	}

	/**
	 * Update the passed user in the database.
	 */
	public void update(User user) {
		entityManager.merge(user);
		return;
	}

	@Override
	public UserDomain getAutherization(User user) {
		UserDomain userDomain=new UserDomain();
		
		Query q = null;
		q = entityManager.createQuery("from User");
		List<User> userData = (List) q.getResultList();
		for (User user2 : userData) {
			if (user2.getUserName().equalsIgnoreCase(user.getUserName()))
				user.setRollname(user2.getRollname());
			else
				user.setRollname("notAuthnticated");

		}
		System.out.println("" + userData.get(0).getUserName());
		
		List<Doctors> doctorsQuesryList = null;
		doctorsQuesryList = entityManager.createQuery("from Doctors").getResultList();
		for(Doctors doctors:doctorsQuesryList){
			userDomain.setDoctors(doctorsQuesryList);
		}
		userDomain.setUser(user);
		
		
		return userDomain;

	}

	@SuppressWarnings("null")
	@Transactional
	@Override
	public UserDomain patientSubscribe(Patients patients) {
		
		UserDomain userDomain= new UserDomain();
		String docname=patients.getDoctorName();
		
		List<Patients> patientQuesryList = null;
		patientQuesryList = entityManager.createQuery("from Patients where doctorName = :doctorName").setParameter("doctorName", docname).getResultList();
		
		
		if(patientQuesryList.size() == 0){
			 entityManager.persist(patients);
		}
		if(patientQuesryList.size() >= 1){
			userDomain.setPatients(patientQuesryList);
			
		}
		
		return userDomain;
	}
}
