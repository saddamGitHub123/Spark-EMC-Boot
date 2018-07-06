/**
 * 
 */
package com.backend.restbackend.dao;

import java.util.List;

import com.backend.restbackend.dto.Person;

/**
 * @author Saddam
 *
 */
public interface UserDAO {
	
	 List<Person> getPersonList();

}
