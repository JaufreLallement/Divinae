package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * 
 * @author alexis
 * La classe CarteIntegristes décrit le comportement général de la carte Integristes
 * Cettye classe est un singleton
 */
public final class CarteIntegristes extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	/**
	 * Unique instance de la classe CarteIntegristes
	 */
	private static volatile CarteIntegristes instance = null;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par défaut, private afin de supprimer le constructeur par défaut publique
	 * Permet également d'éviter que d'autre classes aient accès au coinstructeur
	 */
	private CarteIntegristes() {}
	
	private CarteIntegristes(Origine origine, Dogme[] dogmes, int pointsPriere) {
		super(origine, dogmes, pointsPriere);
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant d'obtenir l'unique instance de la classe CarteIntegristes
	 * @return the instance
	 */
	public final static CarteIntegristes getInstance() {
		if (CarteIntegristes.instance == null) {
			synchronized (CarteIntegristes.instance) {
				if (CarteIntegristes.instance == null) {
					Dogme[] dogmes = {Dogme.HUMAIN, Dogme.NATURE, Dogme.CHAOS};
					CarteIntegristes integristes = new CarteIntegristes(Origine.JOUR, dogmes, 1);
				}
			}
		}
		return instance;
	}
	
	/* ---------- Méthodes ---------- */
	/**
	 * Implémentation de la méthode appliquerEffet
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