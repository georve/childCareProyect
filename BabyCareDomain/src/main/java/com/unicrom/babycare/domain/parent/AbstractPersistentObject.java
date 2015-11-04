/**
 * 
 */
package com.unicrom.babycare.domain.parent;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Georman Calderon
 *
 */
@MappedSuperclass
public class AbstractPersistentObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7815368269241207408L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
   
    @Column (name="CREATED_BY", length=100, nullable=false)
    private String createdBy;
   
    @Temporal (value=TemporalType.TIMESTAMP)
    @Column(name="CREATED_DT")
    private Date createdDt;
    
    @Column(name="CUSTOM_CODE",length=200,nullable=true)
    private String customCode;

    public String getCustomCode() {
		return customCode;
	}

	public void setCustomCode(String customCode) {
		this.customCode = customCode;
	}

	/**
     * @return the id
     */
    public Long getId() {
                return id;
    }

    /**
     * @return the createdBy
     */
    public String getCreatedBy() {
                return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
                this.createdBy = createdBy;
    }

    /**
     * @return the createdDt
     */
    public Date getCreatedDt() {
                return createdDt;
    }

    /**
     * @param createdDt the createdDt to set
     */
    public void setCreatedDt(Date createdDt) {
                this.createdDt = createdDt;
    }

}
