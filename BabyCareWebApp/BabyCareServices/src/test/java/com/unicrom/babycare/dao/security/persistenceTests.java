/**
 * 
 */
package com.unicrom.babycare.dao.security;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.unicrom.babycare.domain.security.Role;
import com.unicrom.babycare.domain.security.User;

/**
 * @author Georman
 *
 */
@ContextConfiguration(locations = { "classpath:/com/unicrom/babycare/dao/security/PersistenceTest-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class persistenceTests {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private UserDao userdao;
	
	@Autowired
	private RoleDao roledao;

	@Test
	@Transactional
	public void testUserDaompl() throws Exception {
		User item = getUserCustom();
		userdao.insert(item);
		assertEquals(3, userdao.count());
	}


	private User getUserCustom() {
		User item = new User();
		item.setCreatedBy("georman.calderon");
		item.setCustomCode("0101");
		item.setEnabled(true);
		item.setName("XXXX");
		item.setPassword("SASDEW");
		return item;
	}
	
	
	@Test
	@Transactional
	public void testRoleDaompl() throws Exception {
		Role item = getRoleCustom();
		roledao.insert(item);
		assertEquals(3, roledao.count());
	}


	private Role getRoleCustom() {
		Role item = new Role();
		item.setCreatedBy("georman.calderon");
		item.setCustomCode("0101");
		item.setName("XXXX");
		item.setUserName("georman");
		item.setDescription("description");
		return item;
	}
	


}