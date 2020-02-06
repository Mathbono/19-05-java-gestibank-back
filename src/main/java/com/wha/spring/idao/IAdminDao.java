package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Admin;

public interface IAdminDao
{
	public void saveAdmin(Admin adm);
	public Admin findAdminById(int id);
	public List<Admin> findAllAdmins();
	public void updateAdmin(Admin adm);
	public void deleteAdminById(int id);
}
