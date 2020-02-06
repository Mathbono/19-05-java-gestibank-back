package com.wha.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDao
{
	@Autowired
	private SessionFactory  sessionFactory;
	
	protected Session getSession() 
	{
		try {
			return sessionFactory.getCurrentSession();
		} catch (Exception e) {
			return sessionFactory.openSession();
		}
	}
	
	public void persist(Object entity)
	{
		getSession().save(entity);
	}
	
	public void delete(Object entity)
	{
		getSession().delete(entity);
	}
}
