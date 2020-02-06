
package com.wha.spring.model;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Messagerie")
public class Messagerie implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private int emetteur; // client, son conseiller habituel, un nouveau conseiller
	
	@Column(nullable = false)
	private GregorianCalendar dateMessage;
	
	@Column(columnDefinition = "TEXT", nullable = false, length = 3800)
	private String Message;
		
	@ManyToOne
    private Client client ;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getEmetteur()
	{
		return emetteur;
	}

	public void setEmetteur(int emetteur)
	{
		this.emetteur = emetteur;
	}

	public GregorianCalendar getDateMessage()
	{
		return dateMessage;
	}

	public void setDateMessage(GregorianCalendar dateMessage)
	{
		this.dateMessage = dateMessage;
	}

	public String getMessage()
	{
		return Message;
	}

	public void setMessage(String message)
	{
		Message = message;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}
	
	
}





