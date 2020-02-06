package com.wha.spring.model;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@NamedQueries(
{})
@Table(name = "Operation")
public class Operation implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long numeroOperation;

	@Column(nullable = false)
	private int typeOperation; // nombre impair : débit, nombre pair : crédit
								// 1 : retrait espèces; 2 : dépôt espèces
								// 3 : virement émis; 4 : virement reçu
								// 5 : chèque émis; 6 : chèque reçu
								// 7: remboursement de frais; 8 : frais divers
								// 9: autre débit; 10: autre crédit
	
	@Column(nullable = false, columnDefinition = "Decimal(10,2) default '0.00'")
	private double montantOperation; // choisir parmi deux solutions:
									// 1ère solution: le montant est toujours positif
									// 2ème solution: le montant est positif pour un crédit et négatif pour un débit

	@Column(nullable = false)
	private String libelle;

	@Column(nullable = false)
	private GregorianCalendar dateOperation;

	@Column(nullable = false)
	private String nomContrepartie;

	@Column(nullable = false)
	private String rIBContrepartie;
	
	@ManyToOne
    private Compte compte ;

	public long getNumeroOperation()
	{
		return numeroOperation;
	}

	public void setNumeroOperation(long numeroOperation)
	{
		this.numeroOperation = numeroOperation;
	}

	public int getTypeOperation()
	{
		return typeOperation;
	}

	public void setTypeOperation(int typeOperation)
	{
		this.typeOperation = typeOperation;
	}

	public double getMontantOperation()
	{
		return montantOperation;
	}

	public void setMontantOperation(double montantOperation)
	{
		this.montantOperation = montantOperation;
	}

	public String getLibelle()
	{
		return libelle;
	}

	public void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}

	public GregorianCalendar getDateOperation()
	{
		return dateOperation;
	}

	public void setDateOperation(GregorianCalendar dateOperation)
	{
		this.dateOperation = dateOperation;
	}

	public String getNomContrepartie()
	{
		return nomContrepartie;
	}

	public void setNomContrepartie(String nomContrepartie)
	{
		this.nomContrepartie = nomContrepartie;
	}

	public String getrIBContrepartie()
	{
		return rIBContrepartie;
	}

	public void setrIBContrepartie(String rIBContrepartie)
	{
		this.rIBContrepartie = rIBContrepartie;
	}

	public Compte getCompte()
	{
		return compte;
	}

	public void setCompte(Compte compte)
	{
		this.compte = compte;
	}
	
	

}
