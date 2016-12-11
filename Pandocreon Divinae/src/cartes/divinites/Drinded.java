/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe d�crivant le comportement de la divinit� Drinded.
 * Cette classe est un singleton
 */
public class Drinded extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private Drinded() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private Drinded(Dogme[] dogmes) {
		super("Drinded", Origine.JOUR, dogmes);
	}
	
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class DrindedHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static Drinded instance = new Drinded(new Dogme[]{Dogme.NATURE, Dogme.HUMAIN, Dogme.SYMBOLES});
	}

	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur permettant de retourner une unique instance de la classe Drinded
	 * @return {Drinded} instance : retourtne l'instance de la classe Drinded
	 */
	public final static Drinded getInstance() {
		return DrindedHolder.instance;
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
