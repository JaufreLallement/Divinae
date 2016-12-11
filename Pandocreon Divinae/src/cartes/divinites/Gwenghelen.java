/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe d�crivant le comportement de la divinit� Gwenghelen.
 * Cette classe est un singleton
 */
public class Gwenghelen extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private Gwenghelen() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private Gwenghelen(Dogme[] dogmes) {
		super("Gwenghelen", Origine.AUBE, dogmes);
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class GwenghelenHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static Gwenghelen instance = new Gwenghelen(new Dogme[]{Dogme.HUMAIN, Dogme.MYSTIQUES, Dogme.SYMBOLES});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe Gwenghelen
	 * @return {Gwenghelen} instance : retourtne l'instance de la classer Gwenghelen
	 */
	public final static Gwenghelen getInstance() {
		return GwenghelenHolder.instance;
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
