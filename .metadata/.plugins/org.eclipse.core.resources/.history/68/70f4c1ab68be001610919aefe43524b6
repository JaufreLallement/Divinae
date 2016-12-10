/**
 * 
 */
package divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe décrivant le comportement de la divinité Llewella.
 * Cette classe est un singleton
 */
public class Llewella extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	/**
	 * Instance de Llewella
	 */
	private static volatile Llewella instance = null;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par défaut.
	 */
	private Llewella() {}

	/**
	 * Constructeur privé avec arguments
	 * La classe étant un singleton, on évite la création de plusieurs instances 
	 */
	private Llewella(Dogme[] dogmes) {
		super("Llewella", Origine.NUIT, dogmes);
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe Llewella
	 * @return {Llewella} instance : retourtne l'instance de la classer Llewella
	 */
	public final static Llewella getInstance() {
		if (Llewella.instance == null) {
			synchronized (Drinded.class) {
				if (Llewella.instance == null) {
					Dogme[] dogmes = {Dogme.NATURE, Dogme.MYSTIQUES, Dogme.CHAOS};
					Llewella.instance = new Llewella(dogmes);
				}
			}
		}
		return Llewella.instance;
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
