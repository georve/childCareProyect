/**
 * 
 */
package com.unicrom.babycare.domain.security;

import javax.persistence.Column;
import javax.persistence.Entity;



import javax.persistence.Table;

import com.unicrom.babycare.domain.parent.AbstractPersistentObject;



/**
 * @author Georman
 *
 */
@Entity
@Table(name="UCPB_ROLE")
public class Role extends AbstractPersistentObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column (name="NAME", length=100, nullable=false)
	private String name;
	
	@Column (name="DESCRIPTION", length=200, nullable=false)
	private String description;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}

