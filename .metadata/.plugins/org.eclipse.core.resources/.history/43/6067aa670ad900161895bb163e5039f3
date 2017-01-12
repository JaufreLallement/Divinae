package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import java.util.ArrayList;

import origine.Origine;
import cartes.Carte;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.CarteDogmatique;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants.CarteCroyant;
import cartes.divinites.Divinite;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteGuideSpirituel decrit le comportement des cartes Guides Spirituels
 */

public class CarteGuideSpirituel extends CarteDogmatique {

	/* ---------- Attributs ---------- */
	/**
	 * Nombre de croyants qu'un guide spirituel peut rassembler
	 */
	private int nbCroyantsTotal = 0;
	
	/**
	 * Tableau contenant les croyants rassembles autour du guide
	 */
	private CarteCroyant[] croyants;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine a attribuer a la carte
	 * @param {Dogme[]} dogmes : dogmes a attribuer  
	 * @param {int} totalCroyants : nombre de croyants total que le Guide peut rassembler
	 * @param {String} intitule : intitule de la carte nouvellement creee
	 * @param {Effet} effet : effet a attribuer a la carte nouvellement creee
	 */
	public CarteGuideSpirituel(Origine origine, Dogme[] dogmes, int totalCroyants, String intitule, Effet effet) {
		super(origine, dogmes, intitule, effet);
		this.nbCroyantsTotal = totalCroyants;
		this.croyants = new CarteCroyant[this.nbCroyantsTotal];
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut nbCroyantsTotal
	 * @return {int} nbCroyantsTotal : retourne le nombre de total croyants que le Guide peut rassembler
	 */
	public int getNbCroyantsTotal() {
		return this.nbCroyantsTotal;
	}

	/**
	 * Modificateur pour l'attribut nbCroyantsTotal
	 * @param {int} nbCroyantsTotal : nombre total de croyants a attribuer a la carte croyant
	 */
	public void setNbCroyantsTotal(int nbCroyantsTotal) {
		this.nbCroyantsTotal = nbCroyantsTotal;
	}

	/**
	 * Accesseur pour l'attribut croyants
	 * @return {CarteCroyant[]} croyants : retourne un tableau de carte croyants
	 */
	public CarteCroyant[] getCroyants() {
		return this.croyants;
	}

	/**
	 * Modificateur pour l'attribut nbCroyantsTotal
	 * @param {CarteCroyant[}} croyants : tableau de croyants a attribuer au Guide
	 */
	public void setCroyants(CarteCroyant[] croyants) {
		this.croyants = croyants;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Methode permettant de lier un croyant a un guide spirituel
	 * @param {CarteCroyant} croyant : croyant a lier au guide
	 */
	public void addCroyant(CarteCroyant croyant) {
		int i = 0;
		boolean attribue = false;
		while (i < this.nbCroyantsTotal && !attribue) {
			if (this.croyants[i] == null) {
				this.croyants[i] = croyant;
				attribue = true;
			}
			i++;
		}
	}
	
	/**
	 * Methode permettant d'ajouter les points de prieres de tous les croyants rassembles autour d'un guide
	 * a une divinite donnee
	 * @param {Divinite} d : divinite a laquelle on souhaite ajouter les points 
	 */
	public void guiderVersDivinite(Divinite d) {
		for (CarteCroyant carteCroyant : croyants) {
			carteCroyant.ajouterPrieres(d);
		}
	}
	
	/**
	 * Méthode retournant tous les guides spirituels
	 * @return {ArrayList<Carte>} guides : retourne un ArrayList contenant tous les guides spirituels
	 */
	public static ArrayList<Carte> getAll() {
		ArrayList<Carte> guides = new ArrayList<Carte>();
		// TODO instancier tous les guides
		return guides;
	}
	
	/**
	 * Methode permettant de donner les détails d'un guide
	 * @return {String} : retourne un chaîne de caractère décrivant le guide
	 */
	@Override
	public String toString() {
		return "Guide Spirituel: " + this.getIntituleCarte() + 
				" ,, Origine: " + this.getOrigineCarte() + 
				" ,, Nombre de croyants: " + this.getNbCroyantsTotal() + 
				" ,, Dogmes: " + this.getDogmes()[0] + ", " + this.getDogmes()[1];
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Carte> testGuides = CarteGuideSpirituel.getAll();
		System.out.println(testGuides.size());
		for (Carte guide : testGuides) {
			System.out.println(guide.toString());
		}
	}

}
