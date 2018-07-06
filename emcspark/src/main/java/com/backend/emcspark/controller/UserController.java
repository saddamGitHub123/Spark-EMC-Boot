/**
 * 
 */
package com.backend.emcspark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.restbackend.dao.UserDAO;
import com.backend.restbackend.dto.Person;

/**
 * @author Saddam
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@GetMapping("/get/allUser")
	public @ResponseBody List<Person> getAllUser() {
		
		return userDAO.getPersonList();
	
	}
	

}
