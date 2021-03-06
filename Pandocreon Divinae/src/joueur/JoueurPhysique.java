/**
 * 
 */
package joueur;

/**
 * @author Lallement
 * La classe JoueurPhysique decrit le comportement de l'unique instance du joueur physique
 * Cette classe est un singleton
 */
public class JoueurPhysique extends Joueur {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec argument
	 * @param {String} nom : nom choisit par le joueur physique
	 */
	private JoueurPhysique(String nom) {
		super(nom);
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne priv�e, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class JoueurPhysiqueHolder {
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static JoueurPhysique instance = new JoueurPhysique("JoueurPhysique");
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur permettant de retourner une unique instance de la classe JoueurPhysique
	 * @return {JoueurPhysique} instance : retourtne l'instance de la classe JoueurPhysique
	 */
	public final static JoueurPhysique getInstance() {
		return JoueurPhysiqueHolder.instance;
	}
		
	
	/* ---------- M�thodes ---------- */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
