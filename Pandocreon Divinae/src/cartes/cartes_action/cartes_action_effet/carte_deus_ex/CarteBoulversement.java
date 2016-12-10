package cartes.cartes_action.cartes_action_effet.carte_deus_ex;



/**
 * 
 * @author alexis
 *  La classe CarteBoulversement décrit le comportement général de la carte Boulversement
 */
public final class CarteBoulversement extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteBoulversement
	 */
	private static volatile CarteBoulversement instance = null;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteBoulversement(){
		super();
	}	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteBoulversement
	 * @return the instance
	 */
	public final static CarteBoulversement getInstance() {
		if (CarteBoulversement.instance == null) {
			synchronized (CarteBoulversement.instance) {
				if (CarteBoulversement.instance == null) {
					
					CarteBoulversement boulversement = new CarteBoulversement();
				}
			}
		}
		return instance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
