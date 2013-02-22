package jeu;

public abstract class Hotel {

	String nom;
	boolean emplacementExt;
	int prixTerrain;
	int prixAchatObligatoire=prixTerrain/2;
	int prixEntree;
	int prixBatimentPrinc;
	boolean batimentPrincConstruit=false;
	int prixBaseLoisir;
	boolean baseLoisirConstruit=false;
	int nbAnnexe;
	int loyer[][] = new int [nbAnnexe+2][6];
	int joueurProprio=0;
	Case casePlateau[];

}
