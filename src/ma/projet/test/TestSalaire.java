package ma.projet.test;

import ma.projet.bean.Personne;
import ma.projet.bean.Profil;

public class TestSalaire {
	public static void main(String[] args) {
		Profil profil = new Profil("DIR", "directeur");
		Personne personne = new Personne("Karim", "SAIMI", "02 juin 1970", 20000, profil);
		personne.affiche();
	}
}
