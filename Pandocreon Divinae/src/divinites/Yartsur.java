/**
 * 
 */
package divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe d�crivant le comportement de la divinit� Yartsur.
 * Cette classe est un singleton
 */
public class Yartsur extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	/**
	 * Instance de Yartsur
	 */
	private static volatile Yartsur instance = null;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut.
	 */
	private Yartsur() {}

	/**
	 * Constructeur priv� avec arguments
	 * La classe �tant un singleton, on �vite la cr�ation de plusieurs instances 
	 */
	private Yartsur(Dogme[] dogmes) {
		super("Yartsur", Origine.JOUR, dogmes);
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * M�thode permettant de retourner une unique instance de la classe Yartsur
	 * @return {Yartsur} instance : retourtne l'instance de la classer Yartsur
	 */
	public final static Yartsur getInstance() {
		if (Yartsur.instance == null) {
			synchronized (Yartsur.class) {
				if (Yartsur.instance == null) {
					Dogme[] dogmes = {Dogme.CHAOS, Dogme.SYMBOLES, Dogme.MYSTIQUES};
					Yartsur.instance = new Yartsur(dogmes);
				}
			}
		}
		return Yartsur.instance;
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