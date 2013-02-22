package jeu;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel{
	
	String image;
	
	public Panneau(String image){
		this.image=image;
	}
	
	public void paintComponent(Graphics g){
	    try {
	      Image img = ImageIO.read(new File(this.image));
	      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }                
	}  

}
