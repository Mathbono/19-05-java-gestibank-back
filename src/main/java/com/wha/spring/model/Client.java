	package com.wha.spring.model;

	import java.io.Serializable;
	import java.util.Collection;

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
	import javax.persistence.NamedQueries;
	import javax.persistence.OneToMany;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;

	@SuppressWarnings("serial")
	@Entity
	@NamedQueries(
	{})
	@Table(name = "client")
	public class Client implements Serializable
	{
		public Client() {
			super();
		}

		public Client(String nom, String prenom, String login,
		String motDePasse, String telephone, String email,
		String situMat, int nombEnf, Adresse adresse) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.login = login;
			this.motDePasse = motDePasse;
			this.telephone = telephone;
			this.email = email;
			this.situMat = situMat;
			this.nombEnf = nombEnf;
			this.adresse = adresse;
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
		private String motDePasse;

		@Column(nullable = true)
		private String telephone;

		@Column(nullable = false)
		private String email;

		@Column(nullable = true)
		private String situMat;

		@Column(nullable = true)
		private int nombEnf;

		@OneToOne(cascade = CascadeType.PERSIST)
		private Adresse adresse;

		@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		private Collection<Justificatif> justificatifs;

		@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		private Collection<DemandeCompteSupplementaire> demandeComptes;

		@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		private Collection<Compte> comptes;

		@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		private Collection<Messagerie> messages;

		@ManyToOne
		private Conseiller conseiller;

		public int getNumInscription()
		{
			return numInscription;
		}

		public Conseiller getConseiller()
		{
			return conseiller;
		}

		public String getNom()
		{
			return nom;
		}

		public String getPrenom()
		{
			return prenom;
		}

		public String getLogin()
		{
			return login;
		}

		public String getMotDePasse()
		{
			return motDePasse;
		}

		public String getTelephone()
		{
			return telephone;
		}

		public String getEmail()
		{
			return email;
		}

		public String getSituMat()
		{
			return situMat;
		}

		public int getNombEnf()
		{
			return nombEnf;
		}

		public void setNumInscription(int numInscription)
		{
			this.numInscription = numInscription;
		}

		public void setNom(String nom)
		{
			this.nom = nom;
		}

		public void setPrenom(String prenom)
		{
			this.prenom = prenom;
		}

		public void setLogin(String login)
		{
			this.login = login;
		}

		public void setMotDePasse(String motDePasse)
		{
			this.motDePasse = motDePasse;
		}

		public void setTelephone(String telephone)
		{
			this.telephone = telephone;
		}

		public void setEmail(String email)
		{
			this.email = email;
		}

		public void setSituMat(String situMat)
		{
			this.situMat = situMat;
		}

		public void setNombEnf(int nombEnf)
		{
			this.nombEnf = nombEnf;
		}

		public void setConseiller(Conseiller conseiller)
		{
			this.conseiller = conseiller;
		}

		public void setAdresse(Adresse adresse)
		{
			this.adresse = adresse;
		}

		public Collection<Justificatif> getJustificatifs()
		{
			return justificatifs;
		}

		public void setJustificatifs(Collection<Justificatif> justificatifs)
		{
			this.justificatifs = justificatifs;
		}

		public Adresse getAdresse()
		{
			return adresse;
		}

		public Collection<DemandeCompteSupplementaire> getDemandeComptes()
		{
			return demandeComptes;
		}

		public void setDemandeComptes(Collection<DemandeCompteSupplementaire> demandeComptes)
		{
			this.demandeComptes = demandeComptes;
		}

		public Collection<Compte> getComptes()
		{
			return comptes;
		}

		public void setComptes(Collection<Compte> comptes)
		{
			this.comptes = comptes;
		}

		public Collection<Messagerie> getMessages()
		{
			return messages;
		}

		public void setMessages(Collection<Messagerie> messages)
		{
			this.messages = messages;
		}
	}
	