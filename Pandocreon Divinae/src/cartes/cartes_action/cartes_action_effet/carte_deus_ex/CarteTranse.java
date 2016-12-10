package cartes.cartes_action.cartes_action_effet.carte_deus_ex;
/**
 * 
 * @author alexis
 *La classe CarteTranse décrit le comportement général de la carte Transe
 */
public final class CarteTranse extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteTranse
	 */
	private static volatile CarteTranse instance = null;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteTranse(){
		super();
	}	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteTranse
	 * @return the instance
	 */
	public final static CarteTranse getInstance() {
		if (CarteTranse.instance == null) {
			synchronized (CarteTranse.instance) {
				if (CarteTranse.instance == null) {
					
					CarteTranse Transe = new CarteTranse();
				}
			}
		}
		return instance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
