/**
 * 
 */
package com.backend.restbackend.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Saddam
 *
 */
@Entity
@Table(name="user_info")
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8379370631322400743L;
	
	@Id
	@GeneratedValue
	private int user_id;
	
	private String name;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING , pattern="dd/MM/yyyy")
	private Date dob;
	
	private Double salary;
	
	public Person() {
		
	}
	
	

	/**
	 * @param user_id
	 * @param name
	 * @param dob
	 * @param salary
	 */
	public Person(int user_id, String name, Date dob, Double salary) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
	}



	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	

}
