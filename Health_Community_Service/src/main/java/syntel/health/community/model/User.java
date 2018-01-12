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
@Table(name = "healthcommunitylogin")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	// ------------------------
	// PRIVATE FIELDS
	// ------------------------

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roleId;

	@NotNull
	private String userName;

	@NotNull
	private String password;
	
	@NotNull
	private String rollname;
	
	

	// ------------------------
	// PUBLIC METHODS
	// ------------------------

	public User() {
		super();
	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	@JsonProperty(value="userName")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonProperty(value="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRollname() {
		return rollname;
	}

	public void setRollname(String rollname) {
		this.rollname = rollname;
	}

	

} 
