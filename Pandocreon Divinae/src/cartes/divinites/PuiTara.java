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
	/**
	 * Instance de PuiTara
	 */
	private static volatile PuiTara instance = null;
	
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
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Méthode permettant de retourner une unique instance de la classe PuiTara
	 * @return {PuiTara} instance : retourtne l'instance de la classer PuiTara
	 */
	public final static PuiTara getInstance() {
		if (PuiTara.instance == null) {
			synchronized (PuiTara.class) {
				if (PuiTara.instance == null) {
					Dogme[] dogmes = {Dogme.NATURE, Dogme.MYSTIQUES, Dogme.SYMBOLES};
					PuiTara.instance = new PuiTara(dogmes);
				}
			}
		}
		return PuiTara.instance;
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
