/**
 * 
 */
package cartes.cartes_action.cartes_apocalypse;

import java.util.ArrayList;

import origine.Origine;
import cartes.cartes_action.CarteAction;

/**
 * @author Lallement
 *
 */
public class CarteApocalypse extends CarteAction {
	/* ---------- Attributs ---------- */
	/**
	 * Possibilit� de poser une carte apocalypse.
	 * True: une carte apocalypse peut �tre pos�e
	 * False sinon 
	 */
	private boolean etatApocalypse = false;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par d�faut
	 */
	public CarteApocalypse() {
		super();
	}

	/**
	 * Constructeur avec arguments
	 * @param {Origine} origine : origine � attribuer la carte apocalypse
	 */
	public CarteApocalypse(Origine origine) {
		super(origine);
	}
	

	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur pour l'attribut etatApocalypse
	 * @return {boolean} etatApocalypse : retourne true si une carte apocalypse peut �tre pos�e, false sinon
	 */
	public boolean isEtatApocalypse() {
		return this.etatApocalypse;
	}

	/**
	 * Modificateur pour l'attribut etatApocalypse
	 */
	public void setEtatApocalypse() {
		this.etatApocalypse = (this.etatApocalypse) ? false : true;
	}
	
	/* ---------- M�thodes ---------- */
	
	/**
	 * M�thode d�terminanty l'action � effectuer lorsqu'une carte apocalypse est utilis�e
	 * calcule les points de chaque joueur, puis �limine un joueur ou d�termine un gagnant
	 */
	public void determinerAction() {
		// TODO calcul des points et �limination ou d�termination d'un gagnant
	}
	
	/**
	 * M�thode permettant d'obtenir toutes les cartes apocalypse
	 * @return {ArrayList<CarteApocalypse>} apocalypses : retourne un ArrayList contenant toutes les cartes apocalypse
	 */
	public static ArrayList<CarteApocalypse> getAllApocalypse() {
		ArrayList<CarteApocalypse> apocalypses = new ArrayList<CarteApocalypse>();
		apocalypses.add(new CarteApocalypse(Origine.JOUR));
		apocalypses.add(new CarteApocalypse(Origine.NUIT));
		apocalypses.add(new CarteApocalypse(Origine.NEANT));
		apocalypses.add(new CarteApocalypse(null));
		apocalypses.add(new CarteApocalypse(null));
		return apocalypses;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<CarteApocalypse> testApocalypse = CarteApocalypse.getAllApocalypse();
		System.out.println(testApocalypse.size());
		System.out.println(testApocalypse.toString());
		for (CarteApocalypse carteApocalypse : testApocalypse) {
			System.out.println(carteApocalypse.getOrigineCarte());
		}
	}

}
