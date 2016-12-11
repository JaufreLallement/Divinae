package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * 
 * @author alexis
 * @author Lalllement
 * La classe CarteIntegristes decrit le comportement general de la carte Integristes
 * Cettye classe est un singleton
 */
public class CarteIntegriste extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par defaut, private afin de supprimer le constructeur par defaut publique
	 * Permet egalement d'eviter que d'autre classes aient acces au coinstructeur
	 */
	private CarteIntegriste() {}
	
	private CarteIntegriste(Origine origine, Dogme[] dogmes, int pointsPriere) {
		super(origine, dogmes, pointsPriere);
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteIntegristesHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteIntegriste instance = new CarteIntegriste(Origine.JOUR, new Dogme[]{Dogme.HUMAIN, Dogme.NATURE, Dogme.CHAOS}, 1);
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Methode permettant d'obtenir l'unique instance de la classe CarteIntegristes
	 * @return the instance
	 */
	public final static CarteIntegriste getInstance() {
		return CarteIntegristesHolder.instance;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Implementation de la methode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
