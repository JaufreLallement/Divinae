package cartes.cartes_action.cartes_action_effet.carte_deus_ex;
/**
 * 
 * @author alexis
 *La classe CarteInfluenceNeant décrit le comportement général de la carte Influence Neant
 */
public final class CarteInfluenceNeant extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteInfluenceNeant
	 */
	private static volatile CarteInfluenceNeant instance = null;
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteInfluenceNeant() {
		super();
	}
	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteInfluenceNeant
	 * @return the instance
	 */
	public final static CarteInfluenceNeant getInstance() {
		if (CarteInfluenceNeant.instance == null) {
			synchronized (CarteInfluenceNeant.instance) {
				if (CarteInfluenceNeant.instance == null) {
					
					CarteInfluenceNeant influenceNeant = new CarteInfluenceNeant();
				}
			}
		}
		return instance;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
