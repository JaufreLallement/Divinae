package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import effets.Effet;

/**
 * 
 * @author alexis
 * @author Lallement
 * La classe CarteMiroir decrit le comportement de la carte Miroir
 */
public class CarteMiroir extends CarteDeusEx implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par defaut, private afin de supprimer le constructeur par defaut publique
	 * Permet egalement d'eviter que d'autre classes aient acces au constructeur
	 */
	private CarteMiroir() {
		super("Miroir");
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteMiroirHolder {		
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteMiroir instance = new CarteMiroir();
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur permettant d'obtenir l'unique instance de la classe CarteMiroir
	 * @return {CarteMiroir} instance : instance unique de la classe
	 */
	public final static CarteMiroir getInstance() {
		return CarteMiroirHolder.instance;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Implémentation de la methode appliquerEffet
	 * @see effet.Effet#appliquerEffet() 
	 */
	@Override
	public void appliquerEffet() {
		// TODO appliquer l'effet correspondant à la carte
	}
	
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		CarteMiroir miroir = new CarteMiroir();
		System.out.println(miroir.getOrigineCarte());
	}

}
