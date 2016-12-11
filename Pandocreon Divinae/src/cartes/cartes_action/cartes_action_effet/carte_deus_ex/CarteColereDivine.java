package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import java.util.ArrayList;

import effets.Effet;
import origine.Origine;

/**
 * 
 * @author Lallement
 * La classe CarteColere Divine decrit le comportement general des cartes Colere Divine
 */
public class CarteColereDivine extends CarteDeusEx implements Effet {
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par defaut, private afin de supprimer le constructeur par defaut publique
	 * Permet de s'assurer que les informations permettant l'identification d'une carte soient fournies
	 */
	private CarteColereDivine() {}
	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement creee
	 */
	public CarteColereDivine(Origine origine) {
		super(origine);
	}
	
	/* ---------- Getters & Setters ---------- */
	
	/* ---------- Methodes ---------- */
	
	/**
	 * M�thode retournant toutes les coleres divines
	 * @return {ArrayList<CarteColereDivine>} divinites : retourne un ArrayList contenant toutes les coleres divines
	 */
	public static ArrayList<CarteColereDivine> getAllColeresDivines() {
		ArrayList<CarteColereDivine> coleresDivines = new ArrayList<CarteColereDivine>();
		coleresDivines.add(new CarteColereDivine(Origine.JOUR));
		coleresDivines.add(new CarteColereDivine(Origine.NUIT));
		return coleresDivines;
	}
	
	/**
	 * Impl�mentation de la methode appliquerEffet
	 * @see effet.Effet#appliquerEffet() 
	 */
	@Override
	public void appliquerEffet() {
		if (super.getOrigineCarte() == Origine.JOUR) {
			// TODO appliquer l'effet correspondant � la carte lorsque son origine est jour
		} else {
			// TODO appliquer l'effet correspondant � la carte lorsque son origine est nuit
		}
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
