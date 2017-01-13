/**
 * 
 */
package interface_graphique;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import partie.Partie;

/**
 * @author Lallement
 *
 */
public class PandocreonFrame extends JFrame {

	/* ------------ Attributs ------------ */
	/**
	 * Affichage du titre du jeu
	 */
	private JLabel titre = new JLabel("Pandocréon Divinae");
	
	/**
	 * Bouton de lancement du jeu
	 */
	private JButton lancerPartie = new JButton("Nouvelle partie");
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur par defaut
	 */
	public PandocreonFrame() throws HeadlessException {
		super("Pandocréon Divinae");
		this.setSize(1300, 800);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
		}
		
		JPanel content = new JPanel();
		content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
		//content.setBorder(BorderFactory.createEmptyBorder(2, 2, 100, 2));
		
		// Ajout du titre
		content.add(this.titre);
		this.titre.setFont(new Font("Arial", 4, 50));
		this.titre.setAlignmentX(CENTER_ALIGNMENT);
		//this.titre.setBorder(BorderFactory.createEmptyBorder(50, 400, 300, 400));
		
		// Ajout du bouton de lancement
		content.add(this.lancerPartie);
		this.lancerPartie.setAlignmentX(CENTER_ALIGNMENT);
		
		// Ajout du contenu
		this.add(content);
		
		
		this.lancerPartie.addActionListener(action -> {
			this.lancerPartie.setEnabled(false);
			Partie.main(null);
		});		
		
	}
	
	/* -------- Getters & Setters -------- */
	
	/* -------- Methodes de classe ------- */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new PandocreonFrame().setVisible(true));
	}

}
