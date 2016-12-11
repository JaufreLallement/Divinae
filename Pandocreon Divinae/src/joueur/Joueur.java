/**
 * 
 */
package joueur;

import java.util.ArrayList;

import partie.Partie;
import cartes.cartes_action.CarteAction;
import cartes.divinites.Divinite;

/**
 * @author Lallement
 * La classe Joueur decrit le comportement general des Joueurs physiques ou virtuels
 */
public class Joueur {
	
	/* ---------- Attributs ---------- */
	/**
	 * Nom du joueur
	 */
	private String nomJoueur;
	
	/**
	 * Jeu du joueur : ArrayList de Carte Action
	 */
	private ArrayList<CarteAction> jeu;
	
	/**
	 * Divinite incranee par le joueur 
	 */
	private Divinite diviniteIncarnee;
	
	/**
	 * Points d'action d'origine Jour du joueur.
	 */
	private int pointsActionJour = 0;
	
	/**
	 * Points d'action d'origine Nuit du joueur.
	 */
	private int pointsActionNuit = 0;
	
	/**
	 * Points d'action d'origine Neant du joueur.
	 */
	private int pointsActionNeant = 0;
	
	/**
	 * Partie � laquelle le joueur participe
	 */
	private Partie partie;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * On supprime le constructeur publique par d�faut afin de s'assurer
	 * que les informations requises soient fournies
	 */
	private Joueur() {}
	
	/**
	 * Constructeur avec argument
	 * @param {String} nom : nom choisit par le joueur physique
	 */
	public Joueur(String nom) {
		this.nomJoueur = nom;
		// TODO partie, jeu, divinite
	}
	
	/**
	 * Constructeur avec arguments
	 * @param {String} nom : nom a attribuer au joueur
	 * @param {Partie} p : partie a laquelle le joueur participe
	 */
	public Joueur(String nom, Partie p) {
		this.nomJoueur = nom;
		this.partie = p;
		// TODO jeu et divinite
	}
	
	/**
	 * Constructeur avec arguments
	 * @param {String} nom : nom du joueur
	 * @param {ArrayList<CarteAction>} jeu : ArrayList des cartes du joueur
	 * @param {Divinite} divinite : divinite incarnee par le joueur
	 * @param {Partie} p : partie a laquelle le joueur participe
	 */
	public Joueur(String nom, ArrayList<CarteAction> jeu, Divinite divinite, Partie p) {
		this.nomJoueur = nom;
		this.jeu = jeu;
		this.diviniteIncarnee = divinite;
		this.partie = p;
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut nom
	 * @return {String} nomJoueur : retourne le nom du joueur
	 */
	public String getNom() {
		return this.nomJoueur;
	}

	/**
	 * Modificateur pour l'attribut nom
	 * @param {String} nom : nom a attribuer au joueur
	 */
	public void setNom(String nom) {
		this.nomJoueur = nom;
	}

	/**
	 * Accesseur pour l'attribut jeu
	 * @return {ArrayList<CarteAction>} jeu : retourne un ArrayList contenant les cartes action du joueur
	 */
	public ArrayList<CarteAction> getJeu() {
		return this.jeu;
	}

	/**
	 * Modificateur pour l'attribut jeu
	 * @param jeu the jeu to set
	 */
	public void setJeu(ArrayList<CarteAction> jeu) {
		this.jeu = jeu;
	}

	/**
	 * Accesseur pour l'attribut diviniteIncarnee
	 * @return {Divinite} diviniteIncarnee : retourne la divinite que le joueur incarne
	 */
	public Divinite getDiviniteIncarnee() {
		return this.diviniteIncarnee;
	}

	/**
	 * Modificateur pour l'attribut diviniteIncarnee
	 * @param {Divinite} divinite : divinite a attribuer au joueur
	 */
	public void setDiviniteIncarnee(Divinite divinite) {
		this.diviniteIncarnee = divinite;
	}

	/**
	 * Accesseur pour l'attribut pointsActionJour
	 * @return {int} pointsActionJour : retourne les points d'action d'origine jour du joueur
	 */
	public int getPointsActionJour() {
		return this.pointsActionJour;
	}

	/**
	 * Modificateur pour l'attribut pointsActionJour
	 * @param {int} pointsActionJour : nombre de points d'action d'origine jour a attribuer au joueur
	 */
	public void setPointsActionJour(int pointsActionJour) {
		this.pointsActionJour = pointsActionJour;
	}

	/**
	 * Accesseur pour l'attribut pointsActionNuit
	 * @return {int} pointsActionNuit : retourne les points d'action d'origine nuit du joueur
	 */
	public int getPointsActionNuit() {
		return this.pointsActionNuit;
	}

	/**
	 * Modificateur pour l'attribut pointsActionNuit
	 * @param {int} pointsActionNuit : nombre de points d'action d'origine nuit a attribuer au joueur
	 */
	public void setPointsActionNuit(int pointsActionNuit) {
		this.pointsActionNuit = pointsActionNuit;
	}

	/**
	 * Accesseur pour l'attribut pointsActionNeant
	 * @return {int} pointsActionNeant : retourne les points d'action d'origine neant du joueur
	 */
	public int getPointsActionNeant() {
		return this.pointsActionNeant;
	}

	/**
	 * Modificateur pour l'attribut pointsActionNeant
	 * @param {int} pointsActionNeant : nombre de points d'action d'origine neant a attribuer au joueur
	 */
	public void setPointsActionNeant(int pointsActionNeant) {
		this.pointsActionNeant = pointsActionNeant;
	}

	/**
	 * Accesseur pour l'attribut partie
	 * @return {Partie} partie : retourne la partie a laquelle le joueur participe
	 */
	public Partie getPartie() {
		return this.partie;
	}

	/**
	 * Modificateur pour l'attribut partie
	 * @param {Partie} p : partie a laquelle on souhaite que le joueur participe
	 */
	public void setPartie(Partie p) {
		this.partie = p;
	}
	
	/* ---------- M�thodes ---------- */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
