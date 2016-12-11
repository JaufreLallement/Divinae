package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import effets.Effet;
import origine.Origine;

/**
 * 
 * @author alexis
 * @author Lallement
 * La classe CartePhoenix decrit le comportement de la carte Phoenix
 */
public class CartePhoenix extends CarteDeusEx implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par defaut, private afin de supprimer le constructeur par defaut publique
	 * Permet egalement d'eviter que d'autre classes aient acces au constructeur
	 */
	private CartePhoenix() {}
	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine � attribuer � la carte nouvellement creee
	 */
	private CartePhoenix(Origine origine) {
		super(origine);
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CartePhoenixHolder {		
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CartePhoenix instance = new CartePhoenix(Origine.NEANT);
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Acceusseur permettant d'obtenir l'unique instance de la classe CartePhoenix
	 * @return {CartePhoenix} instance : instance unique de la classe
	 */
	public final static CartePhoenix getInstance() {
		return CartePhoenixHolder.instance;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Impl�mentation de la methode appliquerEffet 
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO appliquer l'effet correspondant � la carte
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
