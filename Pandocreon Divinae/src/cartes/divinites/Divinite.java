/**
 * 
 */
package cartes.divinites;


import java.util.ArrayList;

import cartes.Carte;
import cartes.cartes_dogmatiques.CarteDogmatique;
import dogme.Dogme;
import effets.Effet;
import origine.Origine;

/**
 * @author Lallement
 * La classe Divinit� d�crit le comportement g�n�ral des divinit�s
 */
public class Divinite extends CarteDogmatique {
	
	/* ---------- Attributs ---------- */	
	/**
	 * Disponibilite de la capacite de la divinite
	 */
	private boolean capaciteDispo = true;
	
	/**
	 * Nombre total de prieres rassembl�es par la divinit�.
	 */
	private int totalPrieres = 0;
	

	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par defaut prive
	 */
	private Divinite() {}
	
	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : Origine de la divinit� nouvellement cr��e
	 * @param {Dogme[]} dogmes : tableau de dogmes � attribuer � la divinite
	 * @param {String} nom : nom � attribuer � la divinite
	 * @paramThisgamesucks10
	 * 
	 */
	public Divinite(Origine origine, Dogme[] dogmes, String intitule, Effet effet) {
		super(origine, dogmes, intitule, effet);
		this.setSacrifiable(false);
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut capaciteDispo
	 * @return {boolean} capaciteDispo : retourne la valeur de l'attribut capaciteDispo. True si la capacit� est disponible, false sinon
	 */
	public boolean isCapaciteDispo() {
		return this.capaciteDispo;
	}

	/**
	 * Modificateur pour l'attribut capaciteDispo
	 * @param {boolean} disponibilite : boolean a attribuer a capaciteDispo; true, la capacite est disponible, false sinon
	 */
	public void setCapaciteDispo(boolean disponibilite) {
		this.capaciteDispo = disponibilite;
	}

	/**
	 * Accesseur pour l'attribut totalPrieres
	 * @return {int} totalPrieres : retourne le nombre de pri�res obtenues par la divinit�
	 */
	public int getTotalPrieres() {
		return this.totalPrieres;
	}

	/**
	 * Modificateur pour l'attribut capaciteDivinite
	 * @param {int} prieres : nombre de pri�re � attribuer � la divinit�
	 */
	public void setTotalPrieres(int nbPrieres) {
		this.totalPrieres = nbPrieres;
	}
	
	
	/* ---------- M�thodes ---------- */
	/**
	 * M�thode retournant toutes les divinites
	 * @return {ArrayList<Carte>} divinites : retourne un ArrayList contenant toutes les divinites
	 */
	public static ArrayList<Carte> getAll() {
		ArrayList<Carte> divinites = new ArrayList<Carte>();
		// TODO instancier toutes les divinites
		return divinites;
	}
	
	/**
	 * Methode permettant de donner les d�tails d'unn divinite
	 * @return {String} : retourne un cha�ne de caract�re d�crivant la divbinite
	 */
	@Override
	public String toString() {
		return "Divinite: " + this.getClass().getSimpleName() + 
				" ,, Origine: " + this.getOrigineCarte() + 
				" ,, Points de priere: " + this.getTotalPrieres() + 
				" ,, Dogmes: " + this.getDogmes()[0] + ", " + this.getDogmes()[1] + ", " + this.getDogmes()[2];
	}
	
	/**
	 * Methode de tests
	 * @param args
	 */
	public static void main(String[] args) {
		/* Tests de la m�thode getAll() */
		ArrayList<Carte> testDivinites = Divinite.getAll();
		System.out.println(testDivinites.size());

		for (Carte divinite : testDivinites) {
			System.out.println(divinite.toString());
		}
	}
}
