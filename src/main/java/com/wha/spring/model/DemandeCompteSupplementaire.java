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
@Table(name = "DemandeCompteSupplementaire")
public class DemandeCompteSupplementaire implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private int typeDemande;
	
	@Column(nullable = false) //traitée ou non traitée
	private String statut;
		
	@Column(nullable = false)
	private GregorianCalendar dateDemande;
	
	@Column(nullable = true)
	private GregorianCalendar datetraitement;
	
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

	public int getTypeDemande()
	{
		return typeDemande;
	}

	public void setTypeDemande(int typeDemande)
	{
		this.typeDemande = typeDemande;
	}

	public String getStatut()
	{
		return statut;
	}

	public void setStatut(String statut)
	{
		this.statut = statut;
	}

	public GregorianCalendar getDateDemande()
	{
		return dateDemande;
	}

	public void setDateDemande(GregorianCalendar dateDemande)
	{
		this.dateDemande = dateDemande;
	}

	public GregorianCalendar getDatetraitement()
	{
		return datetraitement;
	}

	public void setDatetraitement(GregorianCalendar datetraitement)
	{
		this.datetraitement = datetraitement;
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
