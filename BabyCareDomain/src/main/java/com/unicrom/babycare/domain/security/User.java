/**
 * 
 */
package com.unicrom.babycare.domain.security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.LinkedHashSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import org.hibernate.validator.constraints.Email;

import com.unicrom.babycare.domain.parent.AbstractPersistentObject;
import com.unicrom.babycare.domain.utilities.BooleanToIntegerConverter;






/**
 * @author Georman
 *
 */
@Entity
@Table(name="UCPB_USER")
public class User extends AbstractPersistentObject {
	
	private static final long serialVersionUID = 1L;

	@Column (name="NAME", length=100, nullable=false)
    private String name;
    
	@Column (name="PASSWORD", length=100, nullable=false)
	private String password;
    
	@Column (name="ENABLED", nullable=false)
	@Convert(converter=BooleanToIntegerConverter.class)
    private Boolean enabled;
	
	
	@Column (name="EMAIL", length=100, nullable=false)
	@Email(message = "Email Address is not a valid format")
	private String email;
    
    
    /*@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="ID")
    @JoinTable(name="USER_ROLES",
    joinColumns = {@JoinColumn(name="user_id", referencedColumnName="id")},
    inverseJoinColumns = {@JoinColumn(name="role_id", referencedColumnName="id")}
    )
    private Collection<Role> roles = new LinkedHashSet<Role>();

    public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}*/

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
                return name;
    }

    public void setName(String name) {
                this.name = name;
    }

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	
    public static String md5(String input) {
        
        String md5 = null;
         
        if(null == input) return null;
         
        try {
             
        //Create MessageDigest object for MD5
        MessageDigest digest = MessageDigest.getInstance("MD5");
         
        //Update input string in message digest
        digest.update(input.getBytes(), 0, input.length());
 
        //Converts message digest value in base 16 (hex) 
        md5 = new BigInteger(1, digest.digest()).toString(16);
 
        } catch (NoSuchAlgorithmException e) {
 
            e.printStackTrace();
        }
        return md5;
    }


}

