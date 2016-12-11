package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.guides_spirituels;

import java.util.ArrayList;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * @author Lallement
 * La classe CarteMartyr decrit le comportement des cartess Martyr
 */
public class CarteMartyr extends CarteGuideSpirituel implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine a attribuer � la carte
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 */
	public CarteMartyr(Origine origine, Dogme[] dogmes) {
		super(origine, dogmes, 2, "Martyr");
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
	 * Methode retournant toutes les cartes martyrs
	 * @return {ArrayList<CarteMartyr>} divinites : retourne un ArrayList contenant tous les martyrs
	 */
	public static ArrayList<CarteMartyr> getAllMartyrs() {
		ArrayList<CarteMartyr> martyrs = new ArrayList<CarteMartyr>();
		martyrs.add(new CarteMartyr(Origine.JOUR, new Dogme[] {Dogme.NATURE, Dogme.HUMAIN}));
		martyrs.add(new CarteMartyr(Origine.NUIT, new Dogme[] {Dogme.HUMAIN, Dogme.SYMBOLES}));
		martyrs.add(new CarteMartyr(Origine.NEANT, new Dogme[] {Dogme.NATURE, Dogme.CHAOS}));
		return martyrs;
	}

	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
