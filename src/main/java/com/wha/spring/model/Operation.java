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
	private int typeOperation; // nombre impair : d�bit, nombre pair : cr�dit
								// 1 : retrait esp�ces; 2 : d�p�t esp�ces
								// 3 : virement �mis; 4 : virement re�u
								// 5 : ch�que �mis; 6 : ch�que re�u
								// 7: remboursement de frais; 8 : frais divers
								// 9: autre d�bit; 10: autre cr�dit
	
	@Column(nullable = false, columnDefinition = "Decimal(10,2) default '0.00'")
	private double montantOperation; // choisir parmi deux solutions:
									// 1�re solution: le montant est toujours positif
									// 2�me solution: le montant est positif pour un cr�dit et n�gatif pour un d�bit

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
