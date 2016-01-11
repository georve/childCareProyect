/**
 * 
 */
package com.unicrom.babycare.domain.business;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.unicrom.babycare.domain.parent.AbstractPersistentObject;
import com.unicrom.babycare.domain.utilities.BooleanToIntegerConverter;

/**
 * @author Yelitza
 *
 */
@Entity
@Table(name="BC_PARENT")
public class Parent extends AbstractPersistentObject {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	@Column (name="PRT_NAME", length=100, nullable=false)
	private String name;
	
	@Column (name="PRT_RELASHIONSHIP", nullable=false)
	@Convert(converter=BooleanToIntegerConverter.class)
    private Boolean relashionship;
	
	
	@Column (name="PRT_PLACE_EMPLOY", length=100, nullable=false)
	private String placeEmploy;
	
	

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
	 * @return the relashionship
	 */
	public Boolean getRelashionship() {
		return relashionship;
	}


	/**
	 * @param relashionship the relashionship to set
	 */
	public void setRelashionship(Boolean relashionship) {
		this.relashionship = relashionship;
	}


	/**
	 * @return the placeEmploy
	 */
	public String getPlaceEmploy() {
		return placeEmploy;
	}


	/**
	 * @param placeEmploy the placeEmploy to set
	 */
	public void setPlaceEmploy(String placeEmploy) {
		this.placeEmploy = placeEmploy;
	}


}
