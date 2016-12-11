package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

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
	 * Constructeur par d�faut
	 */
	public CarteEsprit() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec arguments
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteEsprit(Dogme[] dogmes) {
		super(Origine.NEANT, dogmes, 2);
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
	 * Methode retournant toutes les cartes esprits
	 * @return {ArrayList<CarteEsprit>} divinites : retourne un ArrayList contenant tous les esprits
	 */
	public static ArrayList<CarteEsprit> getAllEsprits() {
		ArrayList<CarteEsprit> esprits = new ArrayList<CarteEsprit>();
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