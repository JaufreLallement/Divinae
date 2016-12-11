/**
 * 
 */
package cartes.cartes_action;

import java.util.ArrayList;

import origine.Origine;
import cartes.Carte;
import cartes.cartes_action.cartes_action_effet.CartesActionEffet;
import cartes.cartes_action.cartes_apocalypse.CarteApocalypse;

/**
 * @author Lallement
 *
 */
public class CarteAction extends Carte {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut
	 */
	public CarteAction() {
		super(null);
	}

	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine � attribuer � la carte action
	 */
	public CarteAction(Origine origine) {
		super(origine);
	}
	

	/* ---------- Getters & Setters ---------- */
	
	/* ---------- M�thodes ---------- */	
	/**
	 * M�thode permettant de jouer une carte action
	 */
	public void jouerCarte() {
		// TODO d�crire le comportement par d�faut d'une carte action lorsqu'elle est jou�e
	}
	
	/**
	 * M�thode permettant de d�fausser une carte
	 */
	public void defausser() {
		// TODO d�crire le comportement d'une carte action lorsqu'elle est d�fauss�e
	}
	
	/**
	 * M�thode permettant d'obtenir toutes les cartes action
	 * @return {ArrayList<CarteAction>} cartesAction : retourne un ArrayList contenant toutes les cartes actions 
	 */
	public static ArrayList<CarteAction> getAllCartesAction() {
		ArrayList<CarteAction> cartesAction = new ArrayList<CarteAction>();
		cartesAction.addAll(CarteApocalypse.getAllApocalypse());
		cartesAction.addAll(CartesActionEffet.getAllCartesEffet());
		return cartesAction;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<CarteAction> cartesAction = CarteAction.getAllCartesAction();
		System.out.println(cartesAction.size());
	}

}
