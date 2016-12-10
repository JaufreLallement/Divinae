package cartes.cartes_action.cartes_action_effet.carte_deus_ex;
/**
 * 
 * @author alexis
 *La classe CarteInfluenceNuit décrit le comportement général de la carte Influence Nuit
 */
public final class CarteInfluenceNuit extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteInfluenceNuit
	 */
	private static volatile CarteInfluenceNuit instance = null;
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteInfluenceNuit() {
		super();
	}
	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteInfluenceNuit
	 * @return the instance
	 */
	public final static CarteInfluenceNuit getInstance() {
		if (CarteInfluenceNuit.instance == null) {
			synchronized (CarteInfluenceNuit.instance) {
				if (CarteInfluenceNuit.instance == null) {
					
					CarteInfluenceNuit influenceNuit = new CarteInfluenceNuit();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
