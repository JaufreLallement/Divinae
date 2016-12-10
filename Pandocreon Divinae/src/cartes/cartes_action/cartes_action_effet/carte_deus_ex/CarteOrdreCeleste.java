package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import origine.Origine;

/**
 * 
 * @author alexis
 *La classe CarteOrdreCeleste décrit le comportement général de la carte Ordre Celeste
 */


	public final class CarteOrdreCeleste extends CarteDeusEx {
		
		/* ---------- Attributs ---------- */
		/**
		 * Unique instance de la classe CarteOrdreCeleste
		 */
		private static volatile CarteOrdreCeleste instance = null;
		
		/* ---------- Constructeurs ---------- */
		
		/**
		 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
		 * Permet également d'éviter que d'autre classes aient accès au constructeur
		 */
		private CarteOrdreCeleste() {}
		private CarteOrdreCeleste(Origine origine) {
		super (origine);
		}
		/* ---------- Getters & Setters ---------- */
		/* ---------- Méthodes ---------- */
		/**
		 * Méthode permettant d'obtenir l'unique instance de la classe CarteOrdreCeleste
		 * @return the instance
		 */
		public final static CarteOrdreCeleste getInstance() {
			if (CarteOrdreCeleste.instance == null) {
				synchronized (CarteOrdreCeleste.instance) {
					if (CarteOrdreCeleste.instance == null) {
						
						CarteOrdreCeleste ordreCeleste = new CarteOrdreCeleste(Origine.JOUR);
					}
				}
			}
			return instance;
		}
		
			public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

