/**
 * 
 */
package divinites;

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
	/**
	 * Instance de Drinded
	 */
	private static volatile Drinded instance = null;
	
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
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe Drinded
	 * @return {Drinded} instance : retourtne l'instance de la classe Drinded
	 */
	public final static Drinded getInstance() {
		if (Drinded.instance == null) {
			synchronized (Drinded.class) {
				if (Drinded.instance == null) {
					Dogme[] dogmes = {Dogme.NATURE, Dogme.HUMAIN, Dogme.SYMBOLES};
					Drinded.instance = new Drinded(dogmes);
				}
			}
		}
		return Drinded.instance;
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
