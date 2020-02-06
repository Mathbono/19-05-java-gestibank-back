package com.wha.spring.controller;

import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.spring.iservice.IConseillerService;
import com.wha.spring.model.Conseiller;

@RestController
@RequestMapping("/conseiller")
public class ConseillerController
{
	@Autowired
	IConseillerService service;

	@RequestMapping(value = "/dump", method = RequestMethod.GET)
	public String helloGestiBank() {
		Conseiller conseiller1 = new Conseiller(new GregorianCalendar(2010, 10, 10), "Gérard" , "Étienne", "Gétienne", "Tiengé", "0842635878", "gerard.etienne@wanadoo.fr");
		service.saveConseiller(conseiller1);
		
		return "bienvenue";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createClient(@RequestBody Conseiller conseiller) {
		service.saveConseiller(conseiller);
	}

	@RequestMapping(value = "/{matr}", method = RequestMethod.GET)
	public ResponseEntity<Conseiller> getConseiller(@PathVariable int matr) {
		Conseiller resultat = service.findConseillerByMatr(matr);
		System.out.println(resultat);
		return new ResponseEntity<Conseiller>(resultat, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public ResponseEntity<List<Conseiller>> getAllConseillers() {
		List<Conseiller> resultat = service.findAllConseillers();
		System.out.println(resultat);
		return new ResponseEntity<List<Conseiller>>(resultat, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void updateConseiller() {
		service.updateConseiller(null);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void deleteConseillerByMatr(int matr) {
		service.deleteConseillerByMatr(matr);
	}
}
