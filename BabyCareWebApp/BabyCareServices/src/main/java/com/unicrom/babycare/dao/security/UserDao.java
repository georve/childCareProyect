/**
 * 
 */
package com.unicrom.babycare.dao.security;

import org.springframework.stereotype.Repository;

import com.unicrom.babycare.dao.entityparent.EntityDao;
import com.unicrom.babycare.domain.security.User;

/**
 * @author Georman
 *
 */
@Repository
public interface UserDao extends EntityDao<User> {
	
	
	/**
	 * Method that search a user in a storage using login string.
	 * If the user does not exit it return a null object
	 * @param login
	 * @return
	 * @throws Exception 
	 */
	public User getUserByLogin(String login) throws Exception;

}
