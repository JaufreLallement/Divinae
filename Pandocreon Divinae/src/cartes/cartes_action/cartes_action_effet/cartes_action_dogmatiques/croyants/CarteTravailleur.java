package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import cartes.Carte;
import origine.Origine;
import dogme.Dogme;
import effets.Effet;
import exceptions.InvalidDiviniteException;

/**
 * 
 * @author Lallement
 * La classe CarteTravailleurs decrit le comportement general des cartes Travailleurs
 */
public class CarteTravailleur extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteTravailleur(Dogme[] dogmes) {
		super(Origine.JOUR, dogmes, 2, "Travailleur");
	}
	

	/* ---------- Getters & Setters ---------- */
	
	/* ---------- Méthodes ---------- */
	/**
	 * Implémentation de la méthode appliquerEffet
	 * @throws InvalidDiviniteException 
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO appliquer l'effet correspondant
	}
	
	/**
	 * Methode permettant de dissiper l'effet de la carte
	 */
	public void dissiperEffet() {
		// TODO dissper
	}
	
	/**
	 * Methode retournant toutes les cartes travailleurs
	 * @return {ArrayList<CarteTravailleurs>} divinites : retourne un ArrayList contenant tous les travailleurs
	 */
	public static ArrayList<Carte> getAll() {
		ArrayList<Carte> travailleurs = new ArrayList<Carte>();
		travailleurs.add(new CarteTravailleur(new Dogme[] {Dogme.SYMBOLES, Dogme.HUMAIN, Dogme.CHAOS}));
		travailleurs.add(new CarteTravailleur(new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.SYMBOLES}));
		travailleurs.add(new CarteTravailleur(new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}));
		return travailleurs;
	}

	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
