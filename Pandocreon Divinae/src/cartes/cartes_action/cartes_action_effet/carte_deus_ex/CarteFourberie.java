package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import origine.Origine;

/**
 * 
 * @author alexis
 * La classe CarteFourberie décrit le comportement général de la carte Fourberie
 */
public final class CarteFourberie extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteFourberie
	 */
	private static volatile CarteFourberie instance = null;
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteFourberie(){}
	
	private CarteFourberie(Origine origine) {
	super (origine);
	}
	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteFourberie
	 * @return the instance
	 */
	public final static CarteFourberie getInstance() {
		if (CarteFourberie.instance == null) {
			synchronized (CarteFourberie.instance) {
				if (CarteFourberie.instance == null) {
					
					CarteFourberie fourberie = new CarteFourberie(Origine.NUIT);
				}
			}
		}
		return instance;
	}	
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
