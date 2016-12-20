/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe décrivant le comportement de la divinite Brewalen.
 * Cette classe est un singleton
 */
public class Brewalen extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par défaut.
	 */
	private Brewalen() {}

	/**
	 * Constructeur privé avec arguments
	 * La classe étant un singleton, on évite la création de plusieurs instances 
	 */
	private Brewalen(Dogme[] dogmes) {
		super(Origine.JOUR, dogmes);
		
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class BrewalenHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static Brewalen instance = new Brewalen(new Dogme[]{Dogme.NATURE, Dogme.HUMAIN, Dogme.MYSTIQUES});
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe Brewalen
	 * @return {Brewalen} instance : retourtne l'instance de la classer Brewalen
	 */
	public final static Brewalen getInstance() {
		return BrewalenHolder.instance;
	}
	
	/* ---------- Methodes ---------- */
	
	/**
	 * Implémentation de la méthode appliquerEffet
	 */
	@Override
	public void appliquerEffet() {
		// TODO application de l'effet correspondant à la classe.
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		Brewalen b = Brewalen.getInstance();
		Dogme[] d = b.getDogmesDivinite();
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}

}
