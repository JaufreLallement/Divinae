package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import origine.Origine;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.CarteActionDogmatique;
import cartes.divinites.Divinite;
/**
 * 
 * @author alexis
 * @author Lallement
 * La classe CarteCroyant d�crit le comportement g�n�rale des cartes Croyants
 */
public class CarteCroyant extends CarteActionDogmatique {

	/* ---------- Attributs ---------- */
	/**
	 * Points de pri�re de la carte croyant
	 */
	private int pointsPriere = 0;
	
	/**
	 * Num�ro du tour durant lequel la carte a �t� cr��e*
	 * *pos�e sur la table
	 */
	private int numTourCreation = 0;
	
	/**
	 * Possibilit� de sacrifier la carte
	 * True si on peut sacrifier la carte
	 * False sinon, dans les cas o� la carte vient d'�tre cr��e ou si elle est au centre de la table
	 */
	private boolean estSacrifiable = false;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut
	 */
	public CarteCroyant() {
		super();
	}
	
	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine � attribuer � la carte 
	 * @param {int} pointsPriere : points de pri�re que la carte doit poss�der  
	 */
	public CarteCroyant(Origine origine, int pointsPriere) {
		super(origine);
		this.pointsPriere = pointsPriere;
	}
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut pointsPriere
	 * @return {int} pointsPriere : retourne le nombre de points de priere dont dispose la carte
	 */
	public int getPointsPriere() {
		return this.pointsPriere;
	}

	/**
	 * Modificateur pour l'attribut pointsPriere
	 * @param {int} pointsPriere : points de priere � attribuer � la carte 
	 */
	public void setPointsPriere(int pointsPriere) {
		this.pointsPriere = pointsPriere;
	}

	/**
	 * Accesseur pour l'attribut numTourCreation
	 * @return {int} numTourCreation : retourne le num�ro du tour durant lequel la carte a �t� cr��e
	 */
	public int getNumTourCreation() {
		return this.numTourCreation;
	}

	/**
	 * Modificateur pour l'attribut numTourCreation
	 * @param {int} numTourCreation : num�ro du tour de cr�ation � attribuer
	 */
	public void setNumTourCreation(int numTourCreation) {
		this.numTourCreation = numTourCreation;
	}

	/**
	 * Accesseur pour l'attribut estSacrifiable
	 * @return {boolean} estSacrifiable : retourne true si la carte est sacrifiable, false sinon
	 */
	public boolean isEstSacrifiable() {
		return this.estSacrifiable;
	}

	/**
	 * Modificateur pour l'attribut estSacrifiable
	 */
	public void setEstSacrifiable() {
		this.estSacrifiable = (this.estSacrifiable) ? false : true;
	}
	
	/* ---------- M�thodes ---------- */
	/**
	 * M�thode permettant d'ajouter les points de prieres de la carte � une divinite donn�e
	 * @param {Divinite} d : divinite � laquelle on souhaite ajouter les points
	 */
	public void ajouterPrieres(Divinite d) {
		d.setTotalPrieres(d.getTotalPrieres() + this.pointsPriere);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
