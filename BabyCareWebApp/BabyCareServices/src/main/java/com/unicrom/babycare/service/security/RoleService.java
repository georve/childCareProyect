/**
 * 
 */
package com.unicrom.babycare.service.security;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unicrom.babycare.dao.security.RoleDao;
import com.unicrom.babycare.domain.security.Role;
import com.unicrom.babycare.service.parent.EntityService;

/**
 * @author Georman
 *
 */
@Component
@Transactional
@Service
public class RoleService extends EntityService<Role> implements RoleDao {

	
}

