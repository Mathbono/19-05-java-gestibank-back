package com.wha.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ErrorController 
{

	@Autowired
	// ClassInjecte class ;

	@RequestMapping(value = "/HelloBienvueController", method = RequestMethod.GET)
	public String display()
	{
		// traitement à effectué par la méthode du service
		
		
		return "success";
	}
		
	public String authentification()
	{
			
			if(Math.random()>0.5) return "success";
			return "erreur";
	}
	
}
