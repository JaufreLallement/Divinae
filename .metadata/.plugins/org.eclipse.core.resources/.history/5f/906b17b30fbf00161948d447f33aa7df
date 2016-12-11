/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe décrivant le comportement de la divinité Killinstred.
 * Cette classe est un singleton
 */
public class Killinstred extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par défaut.
	 */
	private Killinstred() {}

	/**
	 * Constructeur privé avec arguments
	 * La classe étant un singleton, on évite la création de plusieurs instances 
	 */
	private Killinstred(Dogme[] dogmes) {
		super("Killinstred", Origine.NUIT, dogmes);
	}
	
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class KillinstredHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static Killinstred instance = new Killinstred(KillinstredHolder.getDogmes());
		
		/**
		 * Methode permettant d'obtenir les dogmes de la divinite
		 * @return {Dogme[]} : tableau de dogmes
		 */
		private static Dogme[] getDogmes() {
			return new Dogme[]{Dogme.NATURE, Dogme.MYSTIQUES, Dogme.CHAOS};
		}
	}

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe Killinstred
	 * @return {Killinstred} instance : retourtne l'instance de la classer Killinstred
	 */
	public final static Killinstred getInstance() {
		return KillinstredHolder.instance;
	}
	
	/* ---------- Méthodes ---------- */
	
	/**
	 * Implémentation de la méthode appliquerEffet
	 */
	@Override
	public void appliquerEffet() {
		// TODO application de l'effet correspondant à la classe.
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
