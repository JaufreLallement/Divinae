package cartes.cartes_action.cartes_action_effet.carte_deus_ex;
/**
 * 
 * @author alexis
 *La classe CarteMiroir décrit le comportement général de la carte Miroir
 */
public final class CarteMiroir extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteMiroir
	 */
	private static volatile CarteMiroir instance = null;
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteMiroir() {
		super();
	}
	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteMiroir
	 * @return the instance
	 */
	public final static CarteMiroir getInstance() {
		if (CarteMiroir.instance == null) {
			synchronized (CarteMiroir.instance) {
				if (CarteMiroir.instance == null) {
					
					CarteMiroir miroir = new CarteMiroir();
				}
			}
		}
		return instance;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
