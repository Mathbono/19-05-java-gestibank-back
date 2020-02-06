package com.wha.spring.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Justificatif")
public class Justificatif implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private int type; // carte d'identité, justificatif de domicile ou bulletin de salaire
	
	@Column(nullable = false)
	private String nomFichier;
		
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

	public int getType()
	{
		return type;
	}

	public void setType(int type)
	{
		this.type = type;
	}

	public String getNomFichier()
	{
		return nomFichier;
	}

	public void setNomFichier(String nomFichier)
	{
		this.nomFichier = nomFichier;
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
