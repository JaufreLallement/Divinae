/**
 * 
 */
package joueur;

import java.util.Random;

import strategie.StrategiePassive;
import strategie.Strategy;

/**
 * @author Lallement
 *
 */
public class JoueurVirtuel extends Joueur {
	/* ---------- Attributs ---------- */
	/**
	 * Strategie employ�e par le joueur virtuel
	 */
	private Strategy strategie = new StrategiePassive();
	
	/**
	 * Tableau de differents noms possibles pour les joueurs virtuels
	 */
	private String[] noms = {"Galadriel", "Caranthir", "Manw�", "Varda", "Ulmo", "Aul�", "Yavanna", "Geralt", "Thingol", };

	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur publique par d�faut supprim� pour �viter la cr�ation de joueurs virtuels 
	 * sans informations permettant l'identification.
	 */
	private JoueurVirtuel(String nom) {
		super(nom);
	}
	
	/**
	 * Constructeur avec arguments
	 * @param {Strategy} strategie : strategie que le joueur virtuel cr�� devra employer.
	 */
	public JoueurVirtuel(Strategy strategie, String nom) {
		super(nom);
		this.strategie = strategie;
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut strategie
	 * @return {Strategy} strategie : retourne la strategie employ�e par le joueur virtuel
	 */
	public Strategy getStrategie() {
		return strategie;
	}

	/**
	 * Modificateur pour l'attribut strategie
	 * @param {Strategy} strategie : strategie que le joueur virtuel doit employer
	 */
	public void setStrategie(Strategy strategie) {
		this.strategie = strategie;
	}
	
	/* ---------- M�thodes ---------- */
	
	public void employerStrategie() {
		this.strategie.jouer();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}
