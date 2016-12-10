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
	/**
	 * Instance de Gwenghelen
	 */
	private static volatile Gwenghelen instance = null;
	
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
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe Gwenghelen
	 * @return {Gwenghelen} instance : retourtne l'instance de la classer Gwenghelen
	 */
	public final static Gwenghelen getInstance() {
		if (Gwenghelen.instance == null) {
			synchronized (Gwenghelen.class) {
				if (Gwenghelen.instance == null) {
					Dogme[] dogmes = {Dogme.HUMAIN, Dogme.MYSTIQUES, Dogme.SYMBOLES};
					Gwenghelen.instance = new Gwenghelen(dogmes);
				}
			}
		}
		return Gwenghelen.instance;
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