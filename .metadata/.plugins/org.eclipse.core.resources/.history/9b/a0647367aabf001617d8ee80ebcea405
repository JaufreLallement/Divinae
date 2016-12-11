package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import origine.Origine;
import dogme.Dogme;
import effets.Effet;

/**
 * 
 * @author Lallement
 * La classe CarteNihilliste decrit le comportement de la carte Nihillistes
 */
public class CarteNihilliste extends CarteCroyant implements Effet {

	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par défaut.
	 */
	private CarteNihilliste() {}

	/**
	 * Constructeur privé avec arguments
	 * La classe étant un singleton, on évite la création de plusieurs instances 
	 */
	private CarteNihilliste(Dogme[] dogmes) {
		super(Origine.NEANT, dogmes, 4);	
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteNihillisteHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteNihilliste instance = new CarteNihilliste(new Dogme[]{Dogme.SYMBOLES, Dogme.MYSTIQUES, Dogme.CHAOS});
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe CarteNihilliste
	 * @return {CarteNihilliste} instance : retourtne l'instance de la classe CarteNihilliste
	 */
	public final static CarteNihilliste getInstance() {
		return CarteNihillisteHolder.instance;
	}
	
	/* ---------- Méthodes ---------- */ 	
	/**
	 * Implémentation de la méthode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO application de l'effet correspondant à la classe.
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
