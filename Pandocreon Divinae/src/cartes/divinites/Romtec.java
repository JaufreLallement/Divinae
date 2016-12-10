/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe d�crivant le comportement de la divinit� Romtec.
 * Cette classe est un singleton
 */
public class Romtec extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	/**
	 * Instance de Romtec
	 */
	private static volatile Romtec instance = null;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private Romtec() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private Romtec(Dogme[] dogmes) {
		super("Romtec", Origine.CREPUSCULE, dogmes);
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe Romtec
	 * @return {Romtec} instance : retourtne l'instance de la classer Romtec
	 */
	public final static Romtec getInstance() {
		if (Romtec.instance == null) {
			synchronized (Romtec.class) {
				if (Romtec.instance == null) {
					Dogme[] dogmes = {Dogme.NATURE, Dogme.HUMAIN, Dogme.CHAOS};
					Romtec.instance = new Romtec(dogmes);
				}
			}
		}
		return Romtec.instance;
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
