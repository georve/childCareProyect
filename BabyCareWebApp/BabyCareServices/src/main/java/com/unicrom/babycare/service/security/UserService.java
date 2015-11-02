/**
 * 
 */
package com.unicrom.babycare.service.security;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.unicrom.babycare.dao.security.UserDao;
import com.unicrom.babycare.domain.security.User;
import com.unicrom.babycare.service.parent.EntityService;

/**
 * @author Georman
 *
 */
@Component
@Transactional
public class UserService extends EntityService<User> implements UserDao{

	public User getUserByLogin(String login) throws Exception {
		User loginUser=null;
		List<User> users=this.findByProperty("name", login);
		if(users!=null && !users.isEmpty()){
			loginUser=users.get(0);
		}
		
		return loginUser;
		
	}
	
	
    

}
