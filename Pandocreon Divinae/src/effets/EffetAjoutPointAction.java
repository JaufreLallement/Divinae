/**
 * 
 */
package effets;

import cartes.Carte;
import origine.Origine;

/**
 * @author Lallement
 *
 */
public class EffetAjoutPointAction extends Effet {
	
	/* ------------ Attributs ------------ */
	/**
	 * Origine des points
	 */
	private Origine originePoint;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par defaut prive
	 */
	private EffetAjoutPointAction() {}

	/**
	 * Constructeur avec argument
	 * @param {CartesActionEffet} carte : carte a laquelle attribuer l'effet
	 */
	public EffetAjoutPointAction(Origine origine) {
		super();
		this.originePoint = origine;
	}
	/* -------- Getters & Setters -------- */
	/**
	 * Accesseur pour l'attribut originePoint
	 * @return the originePoint
	 */
	public Origine getOriginePoint() {
		return this.originePoint;
	}

	/**
	 * Modificateur pour l'attribut originePoint
	 * @param originePoint the originePoint to set
	 */
	public void setOriginePoint(Origine originePoint) {
		this.originePoint = originePoint;
	}
	
	/* -------- Methodes de classe ------- */
	/**
	 * Methode permettant d'appliquer l'effet souhaite
	 * @param {CartesActionEffet} carte : carte possedant l'effet; permet de recuperer le joueur a qui ajouter les points 
	 */
	public void appliquerEffet(Carte carte) {
		carte.getJoueur().setPointsAction(this.originePoint, carte.getJoueur().getPointsAction(this.originePoint) + 1);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
