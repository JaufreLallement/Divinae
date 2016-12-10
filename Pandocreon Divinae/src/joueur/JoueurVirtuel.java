/**
 * 
 */
package joueur;

import strategie.StrategiePassive;
import strategie.Strategy;

/**
 * @author Lallement
 *
 */
public class JoueurVirtuel {
	/* ---------- Attributs ---------- */
	/**
	 * Strategie employée par le joueur virtuel
	 */
	private Strategy strategie = new StrategiePassive();

	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur publique par défaut supprimé pour éviter la création de joueurs virtuels 
	 * sans informations permettant l'identification.
	 */
	private JoueurVirtuel() {
		super();
	}
	
	/**
	 * Constructeur avec arguments
	 * @param {Strategy} strategie : strategie que le joueur virtuel créé devra employer.
	 */
	public JoueurVirtuel(Strategy strategie) {
		this.strategie = strategie;
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut strategie
	 * @return {Strategy} strategie : retourne la strategie employée par le joueur virtuel
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
	
	/* ---------- Méthodes ---------- */
	
	public void employerStrategie() {
		this.strategie.jouer();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JoueurVirtuel bot = new JoueurVirtuel();
		bot.employerStrategie();
	}
}
