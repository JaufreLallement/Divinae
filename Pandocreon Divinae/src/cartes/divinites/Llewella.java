/**
 * 
 */
package cartes.divinites;

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
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class LlewellaHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static Llewella instance = new Llewella(LlewellaHolder.getDogmes());
		
		/**
		 * Methode permettant d'obtenir les dogmes de la divinite
		 * @return {Dogme[]} : tableau de dogmes
		 */
		private static Dogme[] getDogmes() {
			return new Dogme[]{Dogme.NATURE, Dogme.MYSTIQUES, Dogme.CHAOS};
		}
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe Llewella
	 * @return {Llewella} instance : retourtne l'instance de la classer Llewella
	 */
	public final static Llewella getInstance() {
		return LlewellaHolder.instance;
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
