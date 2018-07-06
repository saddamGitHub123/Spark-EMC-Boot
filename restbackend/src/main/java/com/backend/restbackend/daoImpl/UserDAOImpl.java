/**
 * 
 */
package com.backend.restbackend.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.restbackend.dao.UserDAO;
import com.backend.restbackend.dto.Person;

/**
 * @author Saddam
 *
 */
@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	/* (non-Javadoc)
	 * @see com.backend.restbackend.dao.UserDAO#getPersonList()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getPersonList() {
		// TODO Auto-generated method stub
		
	   List<Person> listvalue = sessionFactory.getCurrentSession().createQuery("From Person").list();
		
		return listvalue;
	}

}
