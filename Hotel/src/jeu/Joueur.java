package jeu;

public class Joueur extends De{
	
	int argentJoueur;
	String couleur;
	int position=1;
	
	public Joueur(String Couleur, int argentJoueur){
		this.couleur=couleur;
		this.argentJoueur=argentJoueur;
		new De();
	}

	public int getArgentJoueur() {
		return argentJoueur;
	}

	public void setArgentJoueur(int argentJoueur) {
		this.argentJoueur = argentJoueur;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public void seDeplacer(){
		int res;
		res=lancerDeAvance();
		System.out.println("de :"+res);
		if (this.position<=7 && this.position+res>=8 && (Main.deuxJoueur==true || Main.deuxJoueur==false && Main.nbJoueur>2)){
			this.argentJoueur+=2000;
		}
		this.position+=res;
		if(this.position>=Plateau.nbCase+1){
			this.position-=Plateau.nbCase;
		}
		System.out.println("Vous êtes sur la case numero :"+getPosition());
		actionCase(this.position);
		if(res==6){
			seDeplacer();
		}
	}
	
	public void actionCase(int numCase){
		int type;
		type=Plateau.plateau.get(numCase-1).getType();
		if (type==1){
			System.out.println("Type : depart \nCote ext : "+Plateau.plateau.get(numCase-1).isNoirExt()+"\nCote int : "+Plateau.plateau.get(numCase-1).isNoirInt());
		}
		if (type==2){
			System.out.println("Type : entree \nCote ext : "+Plateau.plateau.get(numCase-1).isNoirExt()+"\nCote int : "+Plateau.plateau.get(numCase-1).isNoirInt());
		}
		if (type==3){
			System.out.println("Type : construction \nCote ext : "+Plateau.plateau.get(numCase-1).isNoirExt()+"\nCote int : "+Plateau.plateau.get(numCase-1).isNoirInt());
		}
		if (type==4){
			System.out.println("Type : permis \nCote ext : "+Plateau.plateau.get(numCase-1).isNoirExt()+"\nCote int : "+Plateau.plateau.get(numCase-1).isNoirInt());
		}
		if (type==5){
			System.out.println("Type : achat \nCote ext : "+Plateau.plateau.get(numCase-1).isNoirExt()+"\nCote int : "+Plateau.plateau.get(numCase-1).isNoirInt());
		}
		
	}

}
