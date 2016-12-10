package cartes.cartes_action.cartes_action_effet.carte_deus_ex;
/**
 * 
 * @author alexis
 *La classe CarteInquisition décrit le comportement général de la carte Inquisition
 */
public final class CarteInquisition extends CarteDeusEx {
	
	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteInquisition
	 */
	private static volatile CarteInquisition instance = null;
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au constructeur
	 */
	private CarteInquisition() {
		super();
	}
	
	/* ---------- Getters & Setters ---------- */
	/* ---------- Méthodes ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteInquisition
	 * @return the instance
	 */
	public final static CarteInquisition getInstance() {
		if (CarteInquisition.instance == null) {
			synchronized (CarteInquisition.instance) {
				if (CarteInquisition.instance == null) {
					
					CarteInquisition inquisition = new CarteInquisition();
				}
			}
		}
		return instance;
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
