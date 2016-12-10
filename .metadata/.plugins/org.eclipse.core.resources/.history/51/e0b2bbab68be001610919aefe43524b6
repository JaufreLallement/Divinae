/**
 * 
 */
package divinites;

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
	/**
	 * Instance de Killinstred
	 */
	private static volatile Killinstred instance = null;
	
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
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe Killinstred
	 * @return {Killinstred} instance : retourtne l'instance de la classer Killinstred
	 */
	public final static Killinstred getInstance() {
		if (Killinstred.instance == null) {
			synchronized (Drinded.class) {
				if (Killinstred.instance == null) {
					Dogme[] dogmes = {Dogme.NATURE, Dogme.MYSTIQUES, Dogme.CHAOS};
					Killinstred.instance = new Killinstred(dogmes);
				}
			}
		}
		return Killinstred.instance;
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
