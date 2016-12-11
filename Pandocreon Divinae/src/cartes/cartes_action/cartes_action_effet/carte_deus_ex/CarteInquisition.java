package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import effets.Effet;

/**
 * 
 * @author alexis
 * @author Lallement
 * La classe CarteInquisition decrit le comportement de la carte Inquisition
 */
public class CarteInquisition extends CarteDeusEx implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par defaut, private afin de supprimer le constructeur par defaut publique
	 * Permet egalement d'eviter que d'autre classes aient acces au constructeur
	 */
	private CarteInquisition() {
		super("Inquisition");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteInquisitionHolder {		
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteInquisition instance = new CarteInquisition();
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Acceusseur permettant d'obtenir l'unique instance de la classe CarteInquisition
	 * @return {CarteInquisition} instance : instance unique de la classe
	 */
	public final static CarteInquisition getInstance() {
		return CarteInquisitionHolder.instance;
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
