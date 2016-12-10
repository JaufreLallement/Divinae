/**
 * 
 */
package cartes.divinites;


import java.util.ArrayList;

import joueur.Joueur;
import cartes.Carte;
import dogme.Dogme;
import origine.Origine;

/**
 * @author Lallement
 * La classe Divinité décrit le comportement général des divinités
 */
public class Divinite extends Carte {
	
	/* ---------- Attributs ---------- */
	/**
	 * Nom de la divinité
	 */
	private String nomDivinite;
	
	/**
	 * Tableau contenant les trois dogmes d'une divinité
	 */
	private Dogme[] dogmesDivinite;
	
	/**
	 * Disponibilite de la capacite de la divinite
	 */
	private boolean capaciteDispo = true;
	
	/**
	 * Nombre total de prieres rassemblées par la divinité.
	 */
	private int totalPrieres = 0;
	

	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par défaut   
	 */
	public Divinite() {
		super();
	}
	
	/**
	 * Constructeur avec arguments
	 * @param {String} nom : nom à attribuer à la divinite
	 * @param {Origine} origine : Origine de la divinité nouvellement créée
	 * @param {Dogme[]} dogmes : tableau de dogmes à attribuer à la divinite
	 */
	public Divinite(String nom, Origine origine, Dogme[] dogmes) {
		super(origine);
		this.nomDivinite = nom;
		this.dogmesDivinite = dogmes;
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut nomDivinite
	 * @return {String} nomDivinite : retourne le nom de la divinité
	 */
	public String getNomDivinite() {
		return this.nomDivinite;
	}

	/**
	 * Modificateur pour l'attribut nomDivinite
	 * @param {String} nom : nouveau nom à attribuer à la divinite   
	 */
	public void setNomDivinite(String nom) {
		this.nomDivinite = nom;
	}

	/**
	 * Accesseur pour l'attribut dogmesDivinite
	 * @return {Dogme[]} dogmesDivinite : tableau des dogmes de la divinité
	 */
	public Dogme[] getDogmesDivinite() {
		return this.dogmesDivinite;
	}

	/**
	 * Modificateur pour l'attribut dogmesDivinite
	 * @param {Dogme[]} dogmes : tableau de dogmes à attribuer à la divinité 
	 */
	public void setDogmesDivinite(Dogme[] dogmes) {
		this.dogmesDivinite = dogmes;
	}

	/**
	 * Accesseur pour l'attribut capaciteDispo
	 * @return {boolean} capaciteDispo : retourne la valeur de l'attribut capaciteDispo. True si la capacité est disponible, false sinon
	 */
	public boolean isCapaciteDispo() {
		return this.capaciteDispo;
	}

	/**
	 * Modificateur pour l'attribut capaciteDispo
	 * Si la capacité est disponible au temps tn-1, elle devient indisponible au temps tn
	 * Si la capacité est indisponible au temps tn-1, elle devient disponible au temps tn
	 */
	public void setCapaciteDispo() {
		this.capaciteDispo = (this.capaciteDispo) ? false : true;
	}

	/**
	 * Accesseur pour l'attribut totalPrieres
	 * @return {int} totalPrieres : retourne le nombre de prières obtenues par la divinité
	 */
	public int getTotalPrieres() {
		return this.totalPrieres;
	}

	/**
	 * Modificateur pour l'attribut capaciteDivinite
	 * @param {int} prieres : nombre de prière à attribuer à la divinité
	 */
	public void setTotalPrieres(int nbPrieres) {
		this.totalPrieres = nbPrieres;
	}
	
	
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode retournant toutes les divinites
	 * @return {ArrayList<Divinite>} divinites : retourne un ArrayList contenant toutes les divinites
	 */
	public static ArrayList<Divinite> getAllDivinites() {
		ArrayList<Divinite> divinites = new ArrayList<Divinite>();
		divinites.add(Brewalen.getInstance());
		divinites.add(Drinded.getInstance());
		divinites.add(Gorna.getInstance());
		divinites.add(Gwenghelen.getInstance());
		divinites.add(Killinstred.getInstance());
		divinites.add(Llewella.getInstance());
		divinites.add(PuiTara.getInstance());
		divinites.add(Romtec.getInstance());
		divinites.add(Shingva.getInstance());
		divinites.add(Yartsur.getInstance());
		return divinites;
	}	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Tests de la méthode getAll() */
		ArrayList<Divinite> testDivinites = Divinite.getAllDivinites();
		System.out.println(testDivinites.size());
		System.out.println(testDivinites.contains(Yartsur.getInstance()));
		System.out.println(testDivinites.toString());
	}
}
