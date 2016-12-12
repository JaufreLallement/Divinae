/**
 * 
 */
package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques;

import java.util.ArrayList;

import origine.Origine;
import cartes.cartes_action.cartes_action_effet.CartesActionEffet;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants.CarteCroyant;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels.CarteGuideSpirituel;
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
	 * Constructeur avec argument
	 * @param {String} intitule : intitule de la carte
	 */
	public CarteActionDogmatique(String intitule) {
		super(intitule);
	}
	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine à attribuer à la carte nouvellement créée
	 */
	public CarteActionDogmatique(Origine origine, String intitule) {
		super(origine, intitule);
	}

	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine à attribuer à la carte nouvellement créée
	 * @param {Dogme[]} dogmes : tableau de dogmes à attribuer à la carte
	 */
	public CarteActionDogmatique(Origine origine, Dogme[] dogmes, String intitule) {
		super(origine, intitule);
		this.dogmes = dogmes;
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur permettant d'obtenir les dogmes d'une carte
	 * @return {Dogme[]} dogmes : retourne un tableau contenant les dogmes de la carte
	 */
	public Dogme[] getDogmes() {
		return this.dogmes;
	}
	
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode retournant toutes les cartes dogmatiques
	 * @return {ArrayList<CarteActionDogmatique>} divinites : retourne un ArrayList contenant toutes les cartes dogmatiques
	 */
	public static ArrayList<CarteActionDogmatique> getAllCartesDogmatiques() {
		ArrayList<CarteActionDogmatique> dogmatiques = new ArrayList<CarteActionDogmatique>();
		dogmatiques.addAll(CarteCroyant.getAllCroyants());
		dogmatiques.addAll(CarteGuideSpirituel.getAllGuides());
		return dogmatiques;
	}
	
	/**
	 * Implementation de la methode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO Auto-generated method stub
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dogme[] dogmes = new Dogme[3];
		dogmes[0] = Dogme.CHAOS;
		dogmes[1] = Dogme.HUMAIN;
		System.out.println(dogmes[2]);
	}

}
