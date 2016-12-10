package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import origine.Origine;

/**
 * 
 * @author alexis
 *La classe CarteStase décrit le comportement général de la carte Stase
 */
public final class CarteStase extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteStase
	 */
	private static volatile CarteStase instance = null;
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteStase(){}
	private CarteStase(Origine origine) {
	super (origine);
	}
	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteStase
	 * @return the instance
	 */
	public final static CarteStase getInstance() {
		if (CarteStase.instance == null) {
			synchronized (CarteStase.instance) {
				if (CarteStase.instance == null) {
					
					CarteStase stase = new CarteStase(Origine.JOUR);
				}
			}
		}
		return instance;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
