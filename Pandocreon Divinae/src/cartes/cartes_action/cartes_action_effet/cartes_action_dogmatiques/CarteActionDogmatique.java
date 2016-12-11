/**
 * 
 */
package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques;

import java.util.ArrayList;

import origine.Origine;
import cartes.cartes_action.cartes_action_effet.CartesActionEffet;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants.CarteCroyant;
import cartes.divinites.Brewalen;
import cartes.divinites.Divinite;
import cartes.divinites.Drinded;
import cartes.divinites.Gorna;
import cartes.divinites.Gwenghelen;
import cartes.divinites.Killinstred;
import cartes.divinites.Llewella;
import cartes.divinites.PuiTara;
import cartes.divinites.Romtec;
import cartes.divinites.Shingva;
import cartes.divinites.Yartsur;
import dogme.Dogme;

/**
 * @author Lallement
 *
 */
public abstract class CarteActionDogmatique extends CartesActionEffet {
	
	/* ---------- Attributs ---------- */
	private Dogme[] dogmes;
	
	/* ---------- Constructeurs ---------- */	
	/**
	 * Constructeur par d�faut
	 */
	public CarteActionDogmatique() {
		super();
	}
	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement cr��e
	 */
	public CarteActionDogmatique(Origine origine) {
		super(origine);
	}

	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement cr��e
	 * @param {Dogme[]} dogmes : tableau de dogmes � attribuer � la carte
	 */
	public CarteActionDogmatique(Origine origine, Dogme[] dogmes) {
		super(origine);
		this.dogmes = dogmes;
	}
	
	/* ---------- M�thodes ---------- */
	/**
	 * M�thode retournant toutes les cartes dogmatiques
	 * @return {ArrayList<CarteActionDogmatique>} divinites : retourne un ArrayList contenant toutes les cartes dogmatiques
	 */
	public static ArrayList<CarteActionDogmatique> getAllCartesDogmatiques() {
		ArrayList<CarteActionDogmatique> dogmatiques = new ArrayList<CarteActionDogmatique>();
		dogmatiques.addAll(CarteCroyant.getAllCroyants());
		return dogmatiques;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
