	package com.wha.spring.model;

	import java.io.Serializable;
	import java.util.Collection;
	import java.util.GregorianCalendar;

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;

	@SuppressWarnings("serial")
	@Entity
	@Table(name = "conseiller")
	public class Conseiller implements Serializable
	{
		
		public Conseiller() {
			super();
		}
		
		public Conseiller(GregorianCalendar dateDebutContrat,
		String nom, String prenom,
		String login, String motDePasse,
		String telephone, String email) {
			super();
			this.dateDebutContrat = dateDebutContrat;
			this.nom = nom;
			this.prenom = prenom;
			this.login = login;
			this.motDePasse = motDePasse;
			this.telephone = telephone;
			this.email = email;
		}
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int matricule;
		
		@Column(name = "date_debut_contrat", nullable = false)
		private GregorianCalendar dateDebutContrat;
		
		@Column(nullable = false)
		private String nom;
		
		@Column(nullable = false)
		private String prenom;
		
		@Column(nullable = false)
		private String login;
		
		@Column(nullable = true)
		private String motDePasse;
		
		@Column(nullable = true)
		private String telephone;
		
		@Column(nullable = false)
		private String email;
		
		@ManyToOne
		private Admin admin;
		
		@OneToMany(mappedBy = "conseiller", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		private Collection<Client> clients;
		
		
		public int getMatricule() {
			return matricule;
		}
		public GregorianCalendar getDateDebutContrat() {
			return dateDebutContrat;
		}
		public String getNom() {
			return nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public String getLogin() {
			return login;
		}
		public String getMotdepasse() {
			return motDePasse;
		}
		public String getTelephone() {
			return telephone;
		}
		public String getEmail() {
			return email;
		}
		public Admin getAdmin() {
			return admin;
		}
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		public Collection<Client> getClients() {
			return clients;
		}
		
		
		public void setMatricule(int matricule) {
			this.matricule = matricule;
		}
		public void setDateDebutContrat(GregorianCalendar dateDebutContrat) {
			this.dateDebutContrat = dateDebutContrat;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public void setMotdepasse(String motdepasse) {
			this.motDePasse = motdepasse;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public void setEmail(String email) {
			this.email = email;
		}

		public void setAdmin(Admin admin) {
			this.admin = admin;
		}
		public void setClients(Collection<Client> clients) {
			this.clients = clients;
		}
	}

