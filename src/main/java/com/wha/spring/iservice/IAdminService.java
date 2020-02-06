package com.wha.spring.iservice;

import java.util.List;



import com.wha.spring.model.Admin;


public interface IAdminService 
{
    public void saveAdmin(Admin adm);
    public  void updateAdmin(Admin adm) ;
    public void deleteAdminById(int id);
    public List<Admin> findAllAdmins() ;
	public Admin findAdminById(int id);
}
