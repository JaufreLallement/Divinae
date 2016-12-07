/**
 * 
 */
package cartes;

import dogme.Dogme;
import origine.Origine;

/**
 * @author Lallement
 * La classe De est la classe regroupant tous les types de cartes.
 * Cette classe est abstraite.
 */
public abstract class Carte {
	
	/* ---------- Attributs ---------- */
	private Origine origineCarte;
	

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


	/* ---------- M�thodes ---------- */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}
