/**
 * 
 */
package divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe décrivant le comportement de la divinité Gorna.
 * Cette classe est un singleton
 */
public class Gorna extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	/**
	 * Instance de Gorna
	 */
	private static volatile Gorna instance = null;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par défaut.
	 */
	private Gorna() {}

	/**
	 * Constructeur privé avec arguments
	 * La classe étant un singleton, on évite la création de plusieurs instances 
	 */
	private Gorna(Dogme[] dogmes) {
		super("Gorna", Origine.CREPUSCULE, dogmes);
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe Gorna
	 * @return {Gorna} instance : retourtne l'instance de la classe Gorna
	 */
	public final static Gorna getInstance() {
		if (Gorna.instance == null) {
			synchronized (Gorna.class) {
				if (Gorna.instance == null) {
					Dogme[] dogmes = {Dogme.HUMAIN, Dogme.SYMBOLES, Dogme.CHAOS};
					Gorna.instance = new Gorna(dogmes);
				}
			}
		}
		return Gorna.instance;
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
