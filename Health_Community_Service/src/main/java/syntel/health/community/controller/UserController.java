package syntel.health.community.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import syntel.health.community.domain.UserDomain;
import syntel.health.community.model.Patients;
import syntel.health.community.model.User;
import syntel.health.community.service.UserSevice;


/**
 * 
 * @author Robert Jenifer Vilbert 
 * UserController.java
 */
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserSevice userservice;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public UserDomain isAuthenticate(@RequestBody User user) throws JsonParseException, JsonMappingException, IOException{
		return userservice.getAutherization(user);
		
	}
	
	@RequestMapping(value = "/patientSuscribe", method = RequestMethod.POST)
	@ResponseBody
	public UserDomain patientSubscribe(@RequestBody Patients patients) throws JsonParseException, JsonMappingException, IOException{
	return userservice.patientSubscribe(patients);
		//return patients;
	}
	
}
