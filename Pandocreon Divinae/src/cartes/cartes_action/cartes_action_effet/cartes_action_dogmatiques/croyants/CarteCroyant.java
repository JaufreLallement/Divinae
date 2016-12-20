package cartes.cartes_action.cartes_action_effet.cartes_action_dogmatiques.croyants;

import java.util.ArrayList;

import origine.Origine;
import cartes.Carte;
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
	 * Constructeur avec argument
	 * @param {String} intitule : intitule de la carte
	 */
	public CarteCroyant(String intitule) {
		super(intitule);
	}
	
	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine a attribuer a la carte 
	 * @param {Dogme[]} dogmes : dogmes a attribuer a la carte
	 * @param {int} pointsPriere : points de priere que la carte doit posseder  
	 */
	public CarteCroyant(Origine origine, Dogme[] dogmes, int pointsPriere, String intitule) {
		super(origine, dogmes, intitule);
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
	 * @return {ArrayList<Carte>} croyants : retourne un ArrayList contenant toutes les divinites
	 */
	public static ArrayList<Carte> getAll() {
		ArrayList<Carte> croyants = new ArrayList<Carte>();
		croyants.addAll(CarteAlchimiste.getAll());
		croyants.addAll(CarteAliene.getAll());
		croyants.addAll(CarteDemon.getAll());
		croyants.add(CarteDiplomate.getInstance());
		croyants.addAll(CarteErmite.getAll());
		croyants.addAll(CarteEsprit.getAll());
		croyants.add(CarteGuerrierSaint.getInstance());
		croyants.add(CarteIllusionniste.getInstance());
		croyants.add(CarteIntegriste.getInstance());
		croyants.add(CarteLycanthrope.getInstance());
		croyants.addAll(CarteMoine.getAll());
		croyants.add(CarteNihilliste.getInstance());
		croyants.add(CartePillard.getInstance());
		croyants.add(CarteRevenant.getInstance());
		croyants.add(CarteRevolutionnaire.getInstance());
		croyants.addAll(CarteTravailleur.getAll());
		croyants.addAll(CarteVampire.getAll());
		return croyants;
	}
	
	/**
	 * Methode permettant de donner les d�tails d'un croyant
	 * @return {String} : retourne un cha�ne de caract�re d�crivant le croyant
	 */
	@Override
	public String toString() {
		return "Croyant: " + this.getIntituleCarte() + 
				" ,, Origine: " + this.getOrigineCarte() + 
				" ,, Points de priere: " + this.getPointsPriere() + 
				" ,, Dogmes: " + this.getDogmes()[0] + ", " + this.getDogmes()[1] + ", " + this.getDogmes()[2];
	}
	
	/**
	 * Implementation de la methode appliquerEffet
	 * @see effet.Effet#appliquerEffet()
	 */
	@Override
	public void appliquerEffet() {
		// TODO Auto-generated method stub
	}
	
	/**
	 * 
	 */
	@Override
	public void jouerCarte() {
		this.getJoueur().getPartie().getCentreTable().add(this);
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Carte> testCroyants = CarteCroyant.getAll();
		System.out.println(testCroyants.size());
		for (Carte croyant : testCroyants) {
			System.out.println(croyant.toString());
		}
	}

}
