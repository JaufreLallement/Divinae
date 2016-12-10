/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe d�crivant le comportement de la divinit� Killinstred.
 * Cette classe est un singleton
 */
public class Killinstred extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private Killinstred() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private Killinstred(Dogme[] dogmes) {
		super("Killinstred", Origine.NUIT, dogmes);
	}
	
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
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
	 * M�thode permettant de retourner une unique instance de la classe Killinstred
	 * @return {Killinstred} instance : retourtne l'instance de la classer Killinstred
	 */
	public final static Killinstred getInstance() {
		return KillinstredHolder.instance;
	}
	
	/* ---------- M�thodes ---------- */
	
	/**
	 * Impl�mentation de la m�thode appliquerEffet
	 */
	@Override
	public void appliquerEffet() {
		// TODO application de l'effet correspondant � la classe.
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
