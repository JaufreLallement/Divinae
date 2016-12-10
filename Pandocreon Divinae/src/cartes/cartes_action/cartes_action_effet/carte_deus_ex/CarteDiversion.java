package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import origine.Origine;

/**
 * 
 * @author alexis
 * La classe CarteDiversion décrit le comportement général de la carte Diversion
 */
public final class CarteDiversion extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteDiversion
	 */
	private static volatile CarteDiversion instance = null;
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteDiversion(){}
	private CarteDiversion(Origine origine) {
	super (origine);
	}
	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteDiversion
	 * @return the instance
	 */
	public final static CarteDiversion getInstance() {
		if (CarteDiversion.instance == null) {
			synchronized (CarteDiversion.instance) {
				if (CarteDiversion.instance == null) {
					
					CarteDiversion diversion = new CarteDiversion(Origine.NUIT);
				}
			}
		}
		return instance;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
