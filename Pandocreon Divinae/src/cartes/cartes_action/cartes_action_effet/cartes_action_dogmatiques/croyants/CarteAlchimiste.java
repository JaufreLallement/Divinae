package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import cartes.Carte;
import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteAlchimiste decrit le comportement general des cartes Alchimiste
 */
public class CarteAlchimiste extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteAlchimiste(Dogme[] dogmes) {
		super(Origine.NUIT, dogmes, 2, "Alchimistes");
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
	 * Methode retournant toutes les cartes ermites
	 * @return {ArrayList<Carte>} alchimistes : retourne un ArrayList contenant tous les alchimistes
	 */
	public static ArrayList<Carte> getAll() {
		ArrayList<Carte> alchimistes = new ArrayList<Carte>();
		alchimistes.add(new CarteAlchimiste(new Dogme[] {Dogme.SYMBOLES, Dogme.NATURE, Dogme.CHAOS}));
		alchimistes.add(new CarteAlchimiste(new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.CHAOS}));
		alchimistes.add(new CarteAlchimiste(new Dogme[] {Dogme.SYMBOLES, Dogme.NATURE, Dogme.CHAOS}));
		return alchimistes;
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
