package com.wha.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.wha.spring.idao.IAdminDao;
import com.wha.spring.model.Admin;


@Repository("adminDao")
@Transactional
public class  AdminDaoImpl extends AbstractDao implements IAdminDao 
{
	private final static Logger logger = Logger.getLogger(AdminDaoImpl.class);
	
	public  void saveAdmin(Admin adm) {
		persist(adm);
	}
	
	public Admin findAdminById(int id) {
		logger.info("Find admin by id");
		return (Admin) getSession().get(Admin.class, id);
	}
	
	public List<Admin> findAllAdmins() {
		logger.warn("Begin show admin process");
		String req ="SELECT a FROM Admin a";
		List<Admin> listAdmins = getSession().createQuery(req).list();
		logger.debug("End show admin process");
		return listAdmins;
	}
	
	public void updateAdmin(Admin adm) {
		getSession().update(adm);
	}

	public void deleteAdminById(int id) {
		Session s = getSession();
		s.createQuery("delete from Admin a where a.numInscription=:id").setParameter("id", id).executeUpdate();
	}
}
