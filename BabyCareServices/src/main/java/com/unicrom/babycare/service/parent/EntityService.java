/**
 * 
 */
package com.unicrom.babycare.service.parent;


import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.unicrom.babycare.dao.entityparent.EntityDao;
import com.unicrom.babycare.domain.parent.AbstractPersistentObject;

/**
 * @author Georman
 *
 */
public class EntityService<T extends AbstractPersistentObject> implements EntityDao<T> {
	
	@PersistenceContext(unitName="persistenceUnit")
	 protected EntityManager entityManager;
	 
	 protected T instance;
	 private Class<T> entityClass;
	 
	@Transactional
	public void insert(T t) throws Exception {
		getEntityManager().persist(t);
		
	}
	

	@Transactional
	public T update(T t) throws Exception {
		return getEntityManager().merge(t);
	
	}
	
	
	@Transactional
	public void delete(T t) throws Exception {
		getEntityManager().remove(t);
		
	}
	
	
	@Transactional
	public void deleteById(Long id) throws Exception {
		getEntityManager().remove((T)getEntityManager().find(getEntityClass(), id));
		
	}
	

	@Transactional
	public T findOneById(Long id) throws Exception {
		return (T)getEntityManager().find(getEntityClass(), id);  
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<T> findAll() throws Exception {
        return getEntityManager().createQuery("Select t from " + getEntityClass().getSimpleName() + " t").getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<T> findByProperty(String prop, Object val) throws Exception {
		return (List<T>) getEntityManager().
				createQuery("select x from " + getEntityClass().getSimpleName() + " x where x." + prop + " = ?1").
				setParameter(1, val).getResultList();
	}
	
	
	
	@Transactional
	public long count() throws Exception {
		 return (Long) getEntityManager().
				 createQuery("Select count(t) from " + getEntityClass().getSimpleName() + " t").
				 getSingleResult();
	}

	public EntityManager getEntityManager() {
	     return entityManager;
	 }
	     
	     
	     
	 public void setEntityManager(EntityManager entityManager) throws Exception{
	     this.entityManager = entityManager;
	 }

	     @SuppressWarnings("unchecked")
	  public Class<T> getEntityClass() throws Exception{      
	    if (entityClass == null) {
	             Type type = getClass().getGenericSuperclass();
	           if (type instanceof  ParameterizedType) 
	           {
	               ParameterizedType paramType = (ParameterizedType) type;
	               if (paramType.getActualTypeArguments().length == 2) {
	      if (paramType.getActualTypeArguments()[1] instanceof  TypeVariable) {
	                        throw new IllegalArgumentException(
	                           "Can't find class using reflection");
	                    }
	                     else {
	           entityClass = (Class<T>) paramType.getActualTypeArguments()[1];
	                  }
	                } else {
	           entityClass = (Class<T>) paramType.getActualTypeArguments()[0];
	                 }
	            } else {
	               throw new Exception("Can't find class using reflection");
	           }
	         }
	        return entityClass;
	    }


}

