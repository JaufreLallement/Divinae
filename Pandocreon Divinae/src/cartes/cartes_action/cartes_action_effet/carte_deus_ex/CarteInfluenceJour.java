package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

/**
 * 
 * @author alexis
 *La classe CarteInfluenceJour décrit le comportement général de la carte InfluenceJour
 */
public final class CarteInfluenceJour extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteInfluenceJour
	 */
	private static volatile CarteInfluenceJour instance = null;
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteInfluenceJour() {
		super();
	}
	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteInfluenceJour
	 * @return the instance
	 */
	public final static CarteInfluenceJour getInstance() {
		if (CarteInfluenceJour.instance == null) {
			synchronized (CarteInfluenceJour.instance) {
				if (CarteInfluenceJour.instance == null) {
					
					CarteInfluenceJour influenceJour = new CarteInfluenceJour();
				}
			}
		}
		return instance;
	}
	
	
	
	public static void main(String[] args) {
	
}
}
