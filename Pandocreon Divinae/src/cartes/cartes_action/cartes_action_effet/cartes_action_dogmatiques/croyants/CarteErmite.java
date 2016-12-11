package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * 
 * @author Lallement
 * La classe CarteErmite decrit le comportement general des cartes Ermite
 */
public class CarteErmite extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteErmite(Dogme[] dogmes) {
		super(Origine.JOUR, dogmes, 1, "Ermite");
	}
	

	/* ---------- Getters & Setters ---------- */
	
	/* ---------- Méthodes ---------- */
	/**
	 * Implémentation de la méthode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO Appliquer l'effet correspondant à la carte
	}
	
	/**
	 * Methode retournant toutes les cartes ermites
	 * @return {ArrayList<CarteErmite>} divinites : retourne un ArrayList contenant tous les ermites
	 */
	public static ArrayList<CarteErmite> getAllErmites() {
		ArrayList<CarteErmite> ermites = new ArrayList<CarteErmite>();
		ermites.add(new CarteErmite(new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.CHAOS}));
		ermites.add(new CarteErmite(new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES}));
		return ermites;
	}

	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
