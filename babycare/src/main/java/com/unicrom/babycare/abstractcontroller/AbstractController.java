/**
 * 
 */
package com.unicrom.babycare.abstractcontroller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * <p> Class that contain all commons features about controller to avoid
 * code duplication
 * </p>
 * @author Georman
 *
 */
public class AbstractController {
	 
	
	 /**
	  * This method can get the username who made login using the security context
	  * @return String username user logged
	  */
	 public String getPrincipal(){
	        String userName = null;
	        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	 
	        if (principal instanceof UserDetails) {
	            userName = ((UserDetails)principal).getUsername();
	        } else {
	            userName = principal.toString();
	        }
	        return userName;
	    }

}
