package com.wha.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "adresse")
public class Adresse
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	private String rue;
	
	@Column(nullable = false)
	private String cp;
	
	@Column(nullable = false)
	private String ville;
	
	
	public Adresse() {
		super();
	}
	public Adresse(int i, String r, String c, String v) 
	{
		this.id = i;
		this.rue = r;
		this.cp = c;
		this.ville = v;
	}
	
	
	public int getId() {
		return id;
	}
	public String getRue() {
		return rue;
	}
	public String getCp() {
		return cp;
	}
	public String getVille() {
		return ville;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
}
