package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import cartes.Carte;
import origine.Origine;
import dogme.Dogme;
import effets.Effet;


/**
 * 
 * @author Lallement
 * La classe CarteEsprit decrit le comportement general des cartes Esprits
 */
public class CarteEsprit extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteEsprit(Dogme[] dogmes) {
		super(Origine.NEANT, dogmes, 2, "Esprits");
	}
	

	/* ---------- Getters & Setters ---------- */
	
	/* ---------- Méthodes ---------- */
	/**
	 * Implémentation de la méthode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		this.getJoueur().setPointsActionNeant(this.getJoueur().getPointsActionNeant() + 1);
	}
	
	/**
	 * Methode retournant toutes les cartes esprits
	 * @return {ArrayList<CarteEsprit>} esprits : retourne un ArrayList contenant tous les esprits
	 */
	public static ArrayList<Carte> getAll() {
		ArrayList<Carte> esprits = new ArrayList<Carte>();
		esprits.add(new CarteEsprit(new Dogme[] {Dogme.HUMAIN, Dogme.NATURE, Dogme.MYSTIQUES}));
		esprits.add(new CarteEsprit(new Dogme[] {Dogme.MYSTIQUES, Dogme.HUMAIN, Dogme.CHAOS}));
		esprits.add(new CarteEsprit(new Dogme[] {Dogme.SYMBOLES, Dogme.MYSTIQUES, Dogme.CHAOS}));
		esprits.add(new CarteEsprit(new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.SYMBOLES}));
		esprits.add(new CarteEsprit(new Dogme[] {Dogme.MYSTIQUES, Dogme.NATURE, Dogme.CHAOS}));
		return esprits;
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
