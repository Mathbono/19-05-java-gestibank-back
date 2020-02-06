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

import com.wha.spring.iservice.IClientService;
import com.wha.spring.model.Adresse;
import com.wha.spring.model.Client;

@RestController
@RequestMapping("/client")
public class ClientController
{
	@Autowired
	IClientService service;

	@RequestMapping(value = "/dump", method = RequestMethod.GET)
	public String helloGestiBank() 
	{
		Client client1 = new Client("Thérèse", "Yvonne", "Thévonne", "Loulou", "0842658246", "therese.yvonne@yopmail.com", "Mariée", 3, new Adresse(4, "Rue de la Basse-cour", "38500", "Vourey"));
		service.saveClient(client1);
		
		return "bienvenue";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createClient(@RequestBody Client client) {
		service.saveClient(client);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Client> getClient(@PathVariable int id) {
		Client resultat = service.findClientById(id);
		System.out.println(resultat);
		return new ResponseEntity<Client>(resultat, HttpStatus.OK);
	}

	@RequestMapping(value = "/getall")
	public ResponseEntity<List<Client>> getAllClients() {
		List<Client> resultat = service.findAllClients();
		System.out.println(resultat);
		return new ResponseEntity<List<Client>>(resultat, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void updateClient() {
		service.updateClient(null);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void deleteClientById(int id) {
		service.deleteClientById(id);
	}
}
