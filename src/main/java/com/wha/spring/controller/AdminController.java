package com.wha.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.spring.iservice.IAdminService;
import com.wha.spring.model.Admin;

@RestController
@RequestMapping("/admin")
public class AdminController
{
	@Autowired
	IAdminService service;
	
	@RequestMapping(value = "/dump", method = RequestMethod.GET)
	public String helloGestiBank() 
	{
		Admin adm1 = new Admin("nom0", "prenom0", "login0", "motdepasse0", "telephone0"," email0");
		Admin adm2 = new Admin("nom1", "prenom1", "login1", "motdepasse1", "telephone1"," email1");
		Admin adm3 = new Admin("nom21", "prenom2", "login2", "motdepasse2", "telephone2"," email2");
		service.saveAdmin(adm1);
		service.saveAdmin(adm2);
		service.saveAdmin(adm3);
		
		return "bienvenue";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createAdmin(@RequestBody Admin adm) {
		service.saveAdmin(adm);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Admin> getAdmin(@PathVariable int id) {
		Admin resultat = service.findAdminById(id);
		System.out.println(resultat);
		return new ResponseEntity<Admin>(resultat, HttpStatus.OK);
	}

	@RequestMapping(value = "/getall")
	public ResponseEntity<List<Admin>> getAllAdmin() {
		List<Admin> resultat = service.findAllAdmins();
		System.out.println(resultat);
		return new ResponseEntity<List<Admin>>(resultat, HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void updateAdmin(@RequestBody Admin adm) {
		service.updateAdmin(adm);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteAdminById(@PathVariable int id) {
		service.deleteAdminById(id);
	}
}
