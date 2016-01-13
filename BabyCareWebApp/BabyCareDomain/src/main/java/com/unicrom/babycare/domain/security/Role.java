/**
 * 
 */
package com.unicrom.babycare.domain.security;

import javax.persistence.Column;
import javax.persistence.Entity;



import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.unicrom.babycare.domain.parent.AbstractPersistentObject;



/**
 * @author Georman
 *
 */
@Entity
@Table(name="UCPB_ROLE",uniqueConstraints = @UniqueConstraint(
		columnNames = { "role", "username" }))
public class Role extends AbstractPersistentObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Column (name="ROLE", length=100, nullable=false)
	private String role;
	
	
	//@Column (name="USERNAME", length=20, nullable=false)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "username", nullable = false)
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User userName) {
		this.user = userName;
	}

	/**
	 * @return the name
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param name the name to set
	 */
	public void setRole(String role) {
		this.role = role;
	}


	
	

}
