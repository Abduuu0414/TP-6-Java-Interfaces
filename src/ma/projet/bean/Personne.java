package ma.projet.bean;

import ma.projet.inter.IPersonne;

public class Personne implements IPersonne {
	protected int id;
	protected String nom;
	protected String prenom;
	protected String dateNaiss;
	protected double salaire;
	protected Profil profil;

	private static int comp;

	public Personne(String nom, String prenom, String dateNaiss, double salaire, Profil profil) {
		this.id = ++comp;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.salaire = salaire;
		this.profil = profil;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getDateNaiss() {
		return dateNaiss;
	}

	public double getSalaire() {
		return salaire;
	}

	public Profil getProfil() {
		return profil;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	@Override
	public double calculerSalaire() {
		if (this.profil.getLibelle().equals("directeur"))
			return this.salaire * 1.2;
		return this.salaire * 1.1;
	}

	@Override
	public void affiche() {
		System.out.println("Je suis " + profil.getLibelle() + " " + nom + " " + prenom + " ne le " + dateNaiss
				+ " mon salaire est " + calculerSalaire());
	}

}
