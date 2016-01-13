/**
 * 
 */
package com.unicrom.babycare.dao.security;

import org.springframework.stereotype.Repository;

import com.unicrom.babycare.dao.entityparent.EntityDao;
import com.unicrom.babycare.domain.security.Role;

/**
 * @author Georman
 *
 */
@Repository
public interface RoleDao extends EntityDao<Role> {

}
