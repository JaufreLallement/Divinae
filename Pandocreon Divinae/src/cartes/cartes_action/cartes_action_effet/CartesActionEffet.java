/**
 * 
 */
package cartes.cartes_action.cartes_action_effet;

import java.util.ArrayList;

import origine.Origine;
import cartes.cartes_action.CarteAction;
import cartes.cartes_action.cartes_action_effet.carte_deus_ex.CarteDeusEx;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.CarteActionDogmatique;

/**
 * @author Lallement
 *
 */
public class CartesActionEffet extends CarteAction {
	
	/* ---------- Attributs ---------- */
	/**
	 * Intitul� de la carte
	 */
	private String intituleCarte;

	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur priv� par d�faut
	 */
	public CartesActionEffet() {}
	
	/**
	 * Constructeur avec argument
	 * @param {String} intitule : intitule de la carte
	 */
	public CartesActionEffet(String intitule) {
		super();
		this.intituleCarte = intitule;
	}

	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement creee
	 */
	public CartesActionEffet(Origine origine, String intitule) {
		super(origine);
		this.intituleCarte = intitule;
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut intituleCarte
	 * @return {String} intituleCarte : retourne l'intitull� de la carte
	 */
	public String getIntituleCarte() {
		return this.intituleCarte;
	}

	/**
	 * Modificateur pour l'attribut intituleCarte
	 * @param {String} intituleCarte : nouvel intuitul� pour la carte
	 */
	public void setIntituleCarte(String intituleCarte) {
		this.intituleCarte = intituleCarte;
	}
	
	/* ---------- M�thodes ---------- */
	/**
	 * M�thode permettant d'obtenir toutes les cartes action
	 * @return {ArrayList<CartesActionEffet>} cartesActionEffet : retourne un ArrayList contenant toutes les cartes actions 
	 */
	public static ArrayList<CartesActionEffet> getAllCartesEffet() {
		ArrayList<CartesActionEffet> cartesActionEffet = new ArrayList<CartesActionEffet>();
		cartesActionEffet.addAll(CarteActionDogmatique.getAllCartesDogmatiques());
		cartesActionEffet.addAll(CarteDeusEx.getAllDeusEx());
		return cartesActionEffet;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
