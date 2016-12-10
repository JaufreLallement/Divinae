package cartes.cartes_action.cartes_action_effet.carte_deus_ex;
/**
 * 
 * @author alexis
 *La classe CartePhoenix décrit le comportement général de la carte Phoenix
 */
public final class CartePhoenix extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CartePhoenix
	 */
	private static volatile CartePhoenix instance = null;
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CartePhoenix() {
		super();
	}
	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CartePhoenix
	 * @return the instance
	 */
	public final static CartePhoenix getInstance() {
		if (CartePhoenix.instance == null) {
			synchronized (CartePhoenix.instance) {
				if (CartePhoenix.instance == null) {
					
					CartePhoenix phoenix = new CartePhoenix();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
