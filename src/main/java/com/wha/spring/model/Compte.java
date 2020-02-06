package com.wha.spring.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@NamedQueries(
{})
@Table(name = "Compte")
public class Compte implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private String rIB;

	@Column(nullable = false)
	private int typeCompte; // compte courant avec facilité de caisse,
							// compte courant sans facilité de caisse,
							// ou compte d'épargne

	@Column(nullable = false, columnDefinition = "Decimal(10,2) default '0.00'")
	private double soldeDebutAnnee = 0.0;

	@Column(nullable = false, columnDefinition = "Decimal(10,2) default '0.00'")
	private double decouverAutorise = 0.0;

	@Column(nullable = false, columnDefinition = "Decimal(10,2) default '1000000.00'")
	private double plafondAutorise = 1000000.0;

	@Column(nullable = false, columnDefinition = "Decimal(10,2) default '0.00'")
	private double tauxDeRemuneration = 0.0; // c'est un pourcentage

	@ManyToOne
	private Client client;
	
	@OneToMany(mappedBy = "compte")
    private Collection<Operation> operations ;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getTypeCompte()
	{
		return typeCompte;
	}

	public void setTypeCompte(int typeCompte)
	{
		this.typeCompte = typeCompte;
	}

	public double getDecouverAutorise()
	{
		return decouverAutorise;
	}

	public void setDecouverAutorise(double decouverAutorise)
	{
		this.decouverAutorise = decouverAutorise;
	}

	public double getPlafondAutorise()
	{
		return plafondAutorise;
	}

	public void setPlafondAutorise(double plafondAutorise)
	{
		this.plafondAutorise = plafondAutorise;
	}

	public String getrIB()
	{
		return rIB;
	}

	public void setrIB(String rIB)
	{
		this.rIB = rIB;
	}

	public double getSoldeDebutAnnee()
	{
		return soldeDebutAnnee;
	}

	public void setSoldeDebutAnnee(double soldeDebutAnnee)
	{
		this.soldeDebutAnnee = soldeDebutAnnee;
	}

	public double getTauxDeRemuneration()
	{
		return tauxDeRemuneration;
	}

	public void setTauxDeRemuneration(double tauxDeRemuneration)
	{
		this.tauxDeRemuneration = tauxDeRemuneration;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	public Collection<Operation> getOperations()
	{
		return operations;
	}

	public void setOperations(Collection<Operation> operations)
	{
		this.operations = operations;
	}
	

}
