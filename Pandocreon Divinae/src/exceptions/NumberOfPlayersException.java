/**
 * 
 */
package exceptions;

/**
 * @author Lallement
 *
 */
public class NumberOfPlayersException extends Exception {
	
	/* ------------ Attributs ------------ */
	
	/* ---------- Constructeurs ---------- */
	
	/* -------- Getters & Setters -------- */
	
	/* -------- Methodes de classe ------- */
	/**
	 * M�thode permettant de retourtner un message d'erreur
	 * @return {String} : message � afficher
	 */
	@Override
	public String getMessage() {
		return "Nombre de joueurs invalide!";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
