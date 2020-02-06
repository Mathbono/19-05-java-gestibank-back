	package com.wha.spring.model;

	import java.util.Collection;

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;

	@Entity
	@Table(name = "admin")
	public class Admin
	{
		
		public Admin() {
			super();
		}
		
		public Admin(String nom, String prenom,
		String login, String motdepasse,
		String telephone, String email) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.login = login;
			this.motdepasse = motdepasse;
			this.telephone = telephone;
			this.email = email;
		}
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int numInscription;
		
		@Column(nullable = false)
		private String nom;
		
		@Column(nullable = false)
		private String prenom;
		
		@Column(nullable = false)
		private String login;
		
		@Column(nullable = true)
		private String motdepasse;
		
		@Column(nullable = true)
		private String telephone;
		
		@Column(nullable = false)
		private String email;
		
		@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		private Collection<Conseiller> conseillers;


		public int getNumInscription() {
			return numInscription;
		}
		public void setNumInscription(int numInscription) {
			this.numInscription = numInscription;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getLogin() {
			return login;
		}
		public Collection<Conseiller> getConseillers() {
			return conseillers;
		}


		public void setLogin(String login) {
			this.login = login;
		}
		public String getMotdepasse() {
			return motdepasse;
		}
		public void setMotdepasse(String motdepasse) {
			this.motdepasse = motdepasse;
		}
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setConseillers(Collection<Conseiller> conseillers) {
			this.conseillers = conseillers;
		}
	}
