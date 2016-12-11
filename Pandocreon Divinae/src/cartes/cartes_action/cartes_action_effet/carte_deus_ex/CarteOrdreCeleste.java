package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import effets.Effet;
import origine.Origine;

/**
 * @author alexis
 * @author Lallement
 * La classe CarteOrdreCeleste decrit le comportement de la carte Ordre Celeste
 */
public class CarteOrdreCeleste extends CarteDeusEx implements Effet {
		
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */		
	/**
	 * Constructeur par defaut, private afin de supprimer le constructeur par defaut publique
	 * Permet egalement d'eviter que d'autre classes aient acces au constructeur
	 */
	private CarteOrdreCeleste() {}
	
	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine à attribuer à la carte nouvellement creee
	 */
	private CarteOrdreCeleste(Origine origine) {
		super (origine);
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteOrdreCelesteHolder {		
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteOrdreCeleste instance = new CarteOrdreCeleste(Origine.JOUR);
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur permettant d'obtenir l'unique instance de la classe CarteOrdreCeleste
	 * @return {CarteOrdreCeleste} instance : instance unique de la classe
	 */
	public final static CarteOrdreCeleste getInstance() {
		return CarteOrdreCelesteHolder.instance;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Implémentation de la methode appliquerEffet 
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO appliquer l'effet correspondant à la carte
	}
	
	/**
	 * Méthode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

