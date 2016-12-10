package cartes.cartes_action.cartes_action_effet.carte_deus_ex;

import effets.Effet;
import origine.Origine;

/** 
 * @author alexis
 * @author Lallement
 * La classe CarteStase decrit le comportement de la carte Stase
 */
public class CarteStase extends CarteDeusEx implements Effet {
	
	/* ---------- Attributs ---------- */
	
	/* ---------- Constructeurs ---------- */
	
	/**
	 * Constructeur par defaut, private afin de supprimer le constructeur par defaut publique
	 * Permet egalement d'eviter que d'autre classes aient acces au constructeur
	 */
	private CarteStase(){}
	
	/**
	 * Constructeur avec argument
	 * @param {Origine} origine : origine de la carte nouvellement créée
	 */
	private CarteStase(Origine origine) {
		super (origine);
	}
	
	/* ---------- Holder ---------- */
	/**
	 * @author Lallement
	 * Classe interne privée, responsable de l'instanciation de l'instance unique du Singleton.
	 */
	private static class CarteStaseHolder {		
		/**
		 * Unique instance de la classe non preinitialisee
		 */
		private final static CarteStase instance = new CarteStase(Origine.JOUR);
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur permettant d'obtenir l'unique instance de la classe CarteStase
	 * @return {CarteStase} instance : instance unique de la classe
	 */
	public final static CarteStase getInstance() {
		return CarteStaseHolder.instance;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Implémentation de la methode appliquerEffet 
	 */
	@Override
	public void appliquerEffet() {
		// TODO appliquer l'effet correspondant à la carte
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
