package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import origine.Origine;
import cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.CarteActionDogmatique;
import cartes.divinites.Divinite;
import dogme.Dogme;
/**
 * 
 * @author Lallement
 * La classe CarteCroyant decrit le comportement generale des cartes Croyants
 */
public class CarteCroyant extends CarteActionDogmatique {

	/* ---------- Attributs ---------- */
	/**
	 * Points de priere de la carte croyant
	 */
	private int pointsPriere = 0;
	
	/**
	 * Numero du tour durant lequel la carte a ete creee
	 * *posee sur la table
	 */
	private int numTourCreation = 0;
	
	/**
	 * Possibilite de sacrifier la carte
	 * True si on peut sacrifier la carte
	 * False sinon, dans les cas ou la carte vient d'etre creee ou si elle est au centre de la table
	 */
	private boolean estSacrifiable = false;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par defaut
	 */
	public CarteCroyant() {
		super();
	}
	
	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine a attribuer a la carte 
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 * @param {int} pointsPriere : points de priere que la carte doit posseder  
	 */
	public CarteCroyant(Origine origine, Dogme[] dogmes, int pointsPriere) {
		super(origine, dogmes);
		this.pointsPriere = pointsPriere;
	}
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut pointsPriere
	 * @return {int} pointsPriere : retourne le nombre de points de priere dont dispose la carte
	 */
	public int getPointsPriere() {
		return this.pointsPriere;
	}

	/**
	 * Modificateur pour l'attribut pointsPriere
	 * @param {int} pointsPriere : points de priere � attribuer � la carte 
	 */
	public void setPointsPriere(int pointsPriere) {
		this.pointsPriere = pointsPriere;
	}

	/**
	 * Accesseur pour l'attribut numTourCreation
	 * @return {int} numTourCreation : retourne le num�ro du tour durant lequel la carte a �t� cr��e
	 */
	public int getNumTourCreation() {
		return this.numTourCreation;
	}

	/**
	 * Modificateur pour l'attribut numTourCreation
	 * @param {int} numTourCreation : num�ro du tour de cr�ation � attribuer
	 */
	public void setNumTourCreation(int numTourCreation) {
		this.numTourCreation = numTourCreation;
	}

	/**
	 * Accesseur pour l'attribut estSacrifiable
	 * @return {boolean} estSacrifiable : retourne true si la carte est sacrifiable, false sinon
	 */
	public boolean isEstSacrifiable() {
		return this.estSacrifiable;
	}

	/**
	 * Modificateur pour l'attribut estSacrifiable
	 */
	public void setEstSacrifiable() {
		this.estSacrifiable = (this.estSacrifiable) ? false : true;
	}
	
	/* ---------- Methodes ---------- */
	/**
	 * Methode permettant d'ajouter les points de prieres de la carte � une divinite donn�e
	 * @param {Divinite} d : divinite a laquelle on souhaite ajouter les points
	 */
	public void ajouterPrieres(Divinite d) {
		d.setTotalPrieres(d.getTotalPrieres() + this.pointsPriere);
	}
	
	/**
	 * Methode retournant toutes les cartes croyant
	 * @return {ArrayList<CarteCroyant>} divinites : retourne un ArrayList contenant toutes les divinites
	 */
	public static ArrayList<CarteCroyant> getAllCroyants() {
		ArrayList<CarteCroyant> croyants = new ArrayList<CarteCroyant>();
		croyants.addAll(CarteAlchimiste.getAllAlchimistes());
		croyants.addAll(CarteAliene.getAllAlienes());
		croyants.addAll(CarteDemon.getAllDemons());
		croyants.add(CarteDiplomate.getInstance());
		croyants.addAll(CarteErmite.getAllErmites());
		croyants.addAll(CarteEsprit.getAllEsprits());
		croyants.add(CarteGuerrierSaint.getInstance());
		croyants.add(CarteIllusionniste.getInstance());
		croyants.add(CarteIntegriste.getInstance());
		croyants.add(CarteLycanthrope.getInstance());
		croyants.addAll(CarteMoine.getAllMoines());
		croyants.add(CarteNihilliste.getInstance());
		croyants.add(CartePillard.getInstance());
		croyants.add(CarteRevenant.getInstance());
		croyants.add(CarteRevolutionnaire.getInstance());
		croyants.addAll(CarteTravailleur.getAllTravailleurs());
		croyants.addAll(CarteVampire.getAllVampires());
		return croyants;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
