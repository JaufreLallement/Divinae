package cartes.cartes_action.cartes_action_effet.carte_deus_ex;
/**
 * 
 * @author alexis
 *La classe CarteTrouNoir décrit le comportement général de la carte Trou Noir
 */

public final class CarteTrouNoir extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteTrouNoir
	 */
	private static volatile CarteTrouNoir instance = null;
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteTrouNoir() {
		super();
	}
	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteTrouNoir
	 * @return the instance
	 */
	public final static CarteTrouNoir getInstance() {
		if (CarteTrouNoir.instance == null) {
			synchronized (CarteTrouNoir.instance) {
				if (CarteTrouNoir.instance == null) {
					
					CarteTrouNoir trouNoir = new CarteTrouNoir();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
