/**
 * 
 */
package exceptions;

/**
 * @author Lallement
 *
 */
public class InvalidDiviniteException extends Exception {
	
	/**
	 * M�thode permettant de retourtner un message d'erreur
	 * @return {String} : message � afficher
	 */
	@Override
	public String getMessage() {
		return "Divinite invalide!";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
