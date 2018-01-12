package syntel.health.community.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Represents an User for this web application.
 */
@Entity
@Table(name = "healthcommunitydoctors")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Doctors {

	public Doctors() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long doctors_id;
	private String first_name;

	private String last_name;
	
	private String rollname;

	private String mail_id;

	private String phoneNumber;

	private String location;

	private String rating;
	
	private String specilaztion;
	
	//private Hospitals hospital_id;

	public long getDoctors_id() {
		return doctors_id;
	}

	public void setDoctors_id(long doctors_id) {
		this.doctors_id = doctors_id;
	}

	

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getRollname() {
		return rollname;
	}

	public void setRollname(String rollname) {
		this.rollname = rollname;
	}

	public String getMail_id() {
		return mail_id;
	}

	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	

	

}
