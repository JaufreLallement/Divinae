package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * 
 * @author Lallement
 * La classe CarteTravailleurs decrit le comportement general des cartes Travailleurs
 */
public class CarteTravailleur extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut
	 */
	public CarteTravailleur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteTravailleur(Dogme[] dogmes) {
		super(Origine.JOUR, dogmes, 2);
	}
	

	/* ---------- Getters & Setters ---------- */
	
	/* ---------- M�thodes ---------- */
	/**
	 * Impl�mentation de la m�thode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO Appliquer l'effet correspondant � la carte
	}
	
	/**
	 * Methode retournant toutes les cartes travailleurs
	 * @return {ArrayList<CarteTravailleurs>} divinites : retourne un ArrayList contenant tous les travailleurs
	 */
	public static ArrayList<CarteTravailleur> getAllTravailleurs() {
		ArrayList<CarteTravailleur> travailleurs = new ArrayList<CarteTravailleur>();
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
