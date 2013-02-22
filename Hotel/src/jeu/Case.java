package jeu;

public class Case {
	
	boolean noirInt;
	boolean noirExt;
	int type;
	//type de case :
	// - depart (1)
	// - entrée gratuite (2)
	// - construction gratuite (3)
	// - permis de construire (4)
	// - achat (5)
	// entre case 7 et 8 banque
	// entre case 26 et 27 achat entrée
	// 31 cases

	public Case(int type, boolean noirInt, boolean noirExt){
		this.type=type;
		this.noirInt=noirInt;
		this.noirExt=noirExt;
	}
	
}
