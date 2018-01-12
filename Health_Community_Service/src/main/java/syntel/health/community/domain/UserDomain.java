package syntel.health.community.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import syntel.health.community.model.Doctors;
import syntel.health.community.model.Patients;
import syntel.health.community.model.User;

/**
 * 
 * @author Robert Jenifer Vilbert UserDomain.java
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDomain implements Serializable {
	private static final long serialVersionUID = 5121784553873678901L;

	private String name;
	private String email;
	private Boolean doctorActive;
	private List<Patients> patients;
	
	private List<Doctors> doctors;
	private User user;

	@JsonProperty(value="userName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty(value="password")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserDomain(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public UserDomain() {
		super();
	}

	@Override
	public String toString() {
		return "UserDomain [name=" + name + ", email=" + email + "]";
	}
	
	public List<Doctors> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctors> doctors) {
		this.doctors = doctors;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boolean getDoctorActive() {
		return doctorActive;
	}

	public void setDoctorActive(Boolean doctorActive) {
		this.doctorActive = doctorActive;
	}

	public List<Patients> getPatients() {
		return patients;
	}

	public void setPatients(List<Patients> patients) {
		this.patients = patients;
	}

	


}
