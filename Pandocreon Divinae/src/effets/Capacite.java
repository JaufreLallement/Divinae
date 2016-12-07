/**
 * 
 */
package effets;

/**
 * @author Lallement
 *
 */
public class Capacite implements Effet {
	
	/* ---------- Attributs ---------- */
	/**
	 * Libelle de la capacit�
	 */
	private String libelleCap;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec argument
	 * @param {String} libelle : libelle de la capacit� nouvellement cr��e
	 */
	public Capacite(String libelle) {
		this.libelleCap = libelle;
	}
	
	/* ---------- Getters & Setters ---------- */	
	/**
	 * Accesseur pour l'attribut libelleCap
	 * @return {String} libelleCap : retourne la valeur de l'attribut libelleCap
	 */
	public String getLibelleCap() {
		return this.libelleCap;
	}

	/**
	 * Modificateur pour l'attribut libelleCap
	 * @param {String} libelle : nouveau libelle � attribuer � libelleCap
	 */
	public void setLibelleCap(String libelle) {
		this.libelleCap = libelle;
	}

	/* ---------- M�thodes ---------- */
	/** 
	 * Impl�mentation de la m�thode appliquerEffet de l'interface Effet
	 * @see effets.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		System.out.println("Effet: " + this.libelleCap);
	}

	/**
	 * M�thode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
