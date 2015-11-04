/**
 * 
 */
package com.unicrom.babycare.dao.entityparent;

import java.util.List;

import com.unicrom.babycare.domain.parent.AbstractPersistentObject;

/**
 * @author Georman
 *
 */
public interface EntityDao<T extends AbstractPersistentObject> {
	
    public void insert(T t)throws Exception;
    
    public T update(T t)throws Exception;
    
    public void delete(T t)throws Exception;
    
    public void deleteById(Long id)throws Exception;
    
    public T findOneById(Long id)throws Exception;
    
    public List<T> findAll()throws Exception;
    
    public  List<T> findByProperty(String prop, Object val)throws Exception;
    
    long count() throws Exception;

}