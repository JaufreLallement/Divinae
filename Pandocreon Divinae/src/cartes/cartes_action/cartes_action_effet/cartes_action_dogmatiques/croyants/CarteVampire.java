package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * 
 * @author Lallement
 * La classe CarteVampire decrit le comportement general des cartes Vampire
 */
public class CarteVampire extends CarteCroyant implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteVampire(Dogme[] dogmes) {
		super(Origine.NUIT, dogmes, 1, "Vampires");
	}
	

	/* ---------- Getters & Setters ---------- */
	
	/* ---------- M�thodes ---------- */
	/**
	 * Implementation de la m�thode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO Appliquer l'effet correspondant � la carte
	}
	
	/**
	 * Methode retournant toutes les cartes vampires
	 * @return {ArrayList<CarteVampire>} divinites : retourne un ArrayList contenant tous les vampires
	 */
	public static ArrayList<CarteVampire> getAllVampires() {
		ArrayList<CarteVampire> vampires = new ArrayList<CarteVampire>();
		vampires.add(new CarteVampire(new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.SYMBOLES}));
		vampires.add(new CarteVampire(new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}));
		return vampires;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
