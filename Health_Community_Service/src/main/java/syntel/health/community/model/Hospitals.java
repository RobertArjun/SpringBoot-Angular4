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
@Table(name = "healthcommunityhospital")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hospitals {
	
	public Hospitals() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long hospital_id;
	private String hospital_name;
	private String hospital_address;
	private String hospital_phonenumer;
	public long getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(long hospital_id) {
		this.hospital_id = hospital_id;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public String getHospital_address() {
		return hospital_address;
	}
	public void setHospital_address(String hospital_address) {
		this.hospital_address = hospital_address;
	}
	public String getHospital_phonenumer() {
		return hospital_phonenumer;
	}
	public void setHospital_phonenumer(String hospital_phonenumer) {
		this.hospital_phonenumer = hospital_phonenumer;
	}

	

	

}
