package jeu;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceGraphique extends JFrame {
	
	private Bouton boutonJouer = new Bouton("Jouer");
	private Bouton boutonQuitter = new Bouton("Quitter");
  
	public InterfaceGraphique(){
		//Définit un titre pour notre fenêtre
	    this.setTitle("Jeu de société Hotel");
	    //Définit sa taille 
	    this.setSize(1048, 824);
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    this.setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    this.setContentPane(new Panneau("cover.png")); 
	    this.add(boutonJouer);
	    this.add(boutonQuitter);
	    //On rend la fenetre visible
	    this.setVisible(true);
	}
	
}