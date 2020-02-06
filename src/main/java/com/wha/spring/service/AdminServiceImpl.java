package com.wha.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wha.spring.idao.IAdminDao;
import com.wha.spring.iservice.IAdminService;
import com.wha.spring.model.Admin;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements IAdminService
{
	@Autowired
	private IAdminDao dao;
	
	public void saveAdmin(Admin adm) {
		 dao.saveAdmin(adm);
	}
	 
    public List<Admin> findAllAdmins() {
    	 return dao.findAllAdmins();
    } 

	public Admin findAdminById(int id) {
		return dao.findAdminById(id);
	}
	
	public void updateAdmin(Admin adm) {
		dao.updateAdmin(adm);
	}

	public void deleteAdminById(int id) {
		dao.deleteAdminById(id);
	}
}
