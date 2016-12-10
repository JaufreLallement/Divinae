package cartes.cartes_action.cartes_action_effet.carte_deus_ex;
/**
 * 
 * @author alexis
 * La classe CarteConcentration décrit le comportement général de la carte Concentration
*/

public final class CarteConcentration extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteConcentration
	 */
	private static volatile CarteConcentration instance = null;
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteConcentration() {
		super();
	}
	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteConcentration
	 * @return the instance
	 */
	public final static CarteConcentration getInstance() {
		if (CarteConcentration.instance == null) {
			synchronized (CarteConcentration.instance) {
				if (CarteConcentration.instance == null) {
					
					CarteConcentration concentration = new CarteConcentration();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
