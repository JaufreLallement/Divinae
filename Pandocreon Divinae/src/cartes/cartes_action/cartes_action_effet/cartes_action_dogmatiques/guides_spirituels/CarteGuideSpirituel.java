package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;
import origine.Origine;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.CarteActionDogmatique;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants.CarteCroyant;
import cartes.divinites.Divinite;
import dogme.Dogme;

/**
 * 
 * @author alexis
 * @author Lallement
 * La classe CarteGuideSpirituel d�crit le comportement des cartes Guides Spirituels
 */

public class CarteGuideSpirituel extends CarteActionDogmatique {

	/* ---------- Attributs ---------- */
	/**
	 * Nombre de croyants qu'un guide spirituel peut rassembler
	 */
	private int nbCroyantsTotal = 0;
	
	/**
	 * Tableau contenant les croyants rassembl�s autour du guide
	 */
	private CarteCroyant[] croyants;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut
	 */
	public CarteGuideSpirituel() {
		super();
		this.croyants = new CarteCroyant[this.nbCroyantsTotal];
	}
	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine: origine � attribuer � la carte
	 * @param {int} totalCroyants : nombre de croyants total que le Guide peut rassembler
	 */
	public CarteGuideSpirituel(Origine origine, Dogme[] dogmes, int totalCroyants) {
		super(origine, dogmes);
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
	 * @param {int} nbCroyantsTotal : nombre total de croyants � attribuer � la carte croyant
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
	 * @param {CarteCroyant[}} croyants : tableau de croyants � attribuer au Guide
	 */
	public void setCroyants(CarteCroyant[] croyants) {
		this.croyants = croyants;
	}
	
	/* ---------- M�thodes ---------- */
	/**
	 * M�thode permettant de lier un croyant � un guide spirituel
	 * @param {CarteCroyant} croyant : croyant � lier au guide
	 */
	public void addCroyant(CarteCroyant croyant) {
		boolean arrayEmpty = false;
		for (int i = 0; i < this.nbCroyantsTotal; i++) {
			if (this.croyants[i] == null) this.croyants[i] = croyant;
		}
	}
	
	/**
	 * M�thode permettant d'ajouter les points de prieres de tous les croyants rassembl�s autour d'un guide
	 * � une divinite donn�e
	 * @param {Divinite} d : divinite � laquelle on souhaite ajouter les points 
	 */
	public void guiderVersDivinite(Divinite d) {
		for (CarteCroyant carteCroyant : croyants) {
			carteCroyant.ajouterPrieres(d);
		}
	}
	
	/**
	 * M�thode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		/*CarteGuideSpirituel bouddha = new CarteGuideSpirituel(Origine.JOUR, 3);
		CarteCroyant croyant = new CarteCroyant();
		bouddha.addCroyant(croyant);*/
	}

}
