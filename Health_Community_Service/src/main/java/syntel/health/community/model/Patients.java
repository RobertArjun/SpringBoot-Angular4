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
@Table(name = "healthcommunitypatient")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Patients {

	public Patients() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long patient_id;
	
	private String first_name;

	private String last_name;
	
	private String diseases;

	private long age;

	private String phoneNumber;

	private String Address;

	private String comments;
	
	private String doctorName;

	public long getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(long patient_id) {
		this.patient_id = patient_id;
	}

	@JsonProperty(value="pname")
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
	
	@JsonProperty(value="diseas")
	public String getDiseases() {
		return diseases;
	}

	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}

	@JsonProperty(value="age")
	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}
	
	@JsonProperty(value="phoneNumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	@JsonProperty(value="dname")
	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	

}
