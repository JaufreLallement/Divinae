/**
 * 
 */
package cartes.divinites;

import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * Classe décrivant le comportement de la divinité PuiTara.
 * Cette classe est un singleton
 */
public class PuiTara extends Divinite implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par défaut.
	 */
	private PuiTara() {}

	/**
	 * Constructeur privé avec arguments
	 * La classe étant un singleton, on évite la création de plusieurs instances 
	 */
	private PuiTara(Dogme[] dogmes) {
		super("Pui-Tara", Origine.NUIT, dogmes);
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class PuiTaraHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static PuiTara instance = new PuiTara(new Dogme[]{Dogme.NATURE, Dogme.MYSTIQUES, Dogme.SYMBOLES});
	}

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe PuiTara
	 * @return {PuiTara} instance : retourtne l'instance de la classer PuiTara
	 */
	public final static PuiTara getInstance() {
		return PuiTaraHolder.instance;
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
