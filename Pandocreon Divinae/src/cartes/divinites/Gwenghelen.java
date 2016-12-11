/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe décrivant le comportement de la divinité Gwenghelen.
 * Cette classe est un singleton
 */
public class Gwenghelen extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par défaut.
	 */
	private Gwenghelen() {}

	/**
	 * Constructeur privé avec arguments
	 * La classe étant un singleton, on évite la création de plusieurs instances 
	 */
	private Gwenghelen(Dogme[] dogmes) {
		super("Gwenghelen", Origine.AUBE, dogmes);
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class GwenghelenHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static Gwenghelen instance = new Gwenghelen(new Dogme[]{Dogme.HUMAIN, Dogme.MYSTIQUES, Dogme.SYMBOLES});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe Gwenghelen
	 * @return {Gwenghelen} instance : retourtne l'instance de la classer Gwenghelen
	 */
	public final static Gwenghelen getInstance() {
		return GwenghelenHolder.instance;
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
