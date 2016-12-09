/**
 * 
 */
package cartes;

import java.util.ArrayList;

import joueur.Joueur;
import divinites.Divinite;
import dogme.Dogme;
import origine.Origine;

/**
 * @author Lallement
 * La classe De est la classe regroupant tous les types de cartes.
 * Cette classe est abstraite.
 */
public abstract class Carte {
	
	/* ---------- Attributs ---------- */
	/**
	 * Origine de la carte
	 */
	private Origine origineCarte;
	
	/**
	 * Joueur poss�dant la carte divinit� donn�e
	 */
	private Joueur joueur = null;

	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par d�faut
	 */
	public Carte() {
		this.origineCarte = null;
	}
	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine de la carte nouvellement cr��e
	 */
	public Carte(Origine origine) {
		this.origineCarte = origine;
	}


	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut origineCarte
	 * @return {Origine} origineCarte : retourne l'origine de la carte
	 */
	public Origine getOrigineCarte() {
		return this.origineCarte;
	}



	/**
	 * Modificateur pour l'attribut origineCarte
	 * @param {Origine} origine : origine � attribuer � la carte
	 */
	public void setOrigineCarte(Origine origine) {
		this.origineCarte = origine;
	}
	
	/**
	 * Accesseur pour l'attribut joueur
	 * @return {Joueur} joueur : retourne le joueur poss�dant la divinit�
	 */
	public Joueur getJoueur() {
		return this.joueur;
	}

	/**
	 * Modificateur pour l'attribut joueur
	 * @param {Joueur} joueur : joueur nouveau joueur poss�dant la carte Divinit� donn�e.
	 */
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}


	/* ---------- M�thodes ---------- */
	
	/**
	 * M�thode retournant toutes les cartes
	 * @return {ArrayList<Carte>} cartes : retourne un ArrayList contenant toutes les cartes 
	 */
	public static ArrayList<Carte> getAllCartes() {
		ArrayList<Carte> cartes = new ArrayList<Carte>();
		cartes.addAll(Divinite.getAllDivinites());
		return cartes;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Tests de la m�thode getAllCartes */
		ArrayList<Carte> testCartes = Carte.getAllCartes();
		System.out.println(testCartes.get(5).getOrigineCarte());
		Divinite d = (Divinite)testCartes.get(7);
		System.out.println(d.getNomDivinite());
	}

}
