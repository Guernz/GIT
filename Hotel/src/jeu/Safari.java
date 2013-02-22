package jeu;

public class Safari extends Hotel{
	
	int prixAnnexe1, prixAnnexe2;
	boolean annexe1Construit=false;
	boolean annexe2Construit=false;
	
	public Safari(){
		this.nom="Fujiyama";
		this.emplacementExt=true;
		this.prixTerrain=2000;
		this.prixEntree=150;
		this.prixBatimentPrinc=2600;
		this.nbAnnexe=2;
		this.prixAnnexe1=1200;
		this.prixAnnexe2=1200;
		this.prixBaseLoisir=2000;
		this.loyer[0][0]=100;
		this.loyer[1][0]=100;
		this.loyer[2][0]=250;
		this.loyer[3][0]=500;
		for(int i=1;i<=6;i++){
			this.loyer[0][i]=this.loyer[0][i-1]+100;
			this.loyer[1][i]=this.loyer[1][i-1]+100;
			this.loyer[2][i]=this.loyer[2][i-1]+250;
			this.loyer[3][i]=this.loyer[3][i-1]+500;
		}
		casePlateau[0]=Plateau.plateau.get(26);
		casePlateau[1]=Plateau.plateau.get(27);
		casePlateau[2]=Plateau.plateau.get(28);
		casePlateau[3]=Plateau.plateau.get(29);
		casePlateau[4]=Plateau.plateau.get(30);
	}

}
