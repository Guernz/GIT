package jeu;

import java.util.ArrayList;


public class Plateau {

	int nbCase=31;
	static ArrayList<Case> plateau = new ArrayList<Case>();
	
	public Plateau(){
		Case case1 = new Case(1,false,false);
		plateau.add(case1);
		Case case2 = new Case(4,true,false);
		plateau.add(case2);
		Case case3 = new Case(5,true,true);
		plateau.add(case3);
		Case case4 = new Case(4,true,true);
		plateau.add(case4);
		Case case5 = new Case(5,true,true);
		plateau.add(case5);
		Case case6 = new Case(4,true,true);
		plateau.add(case6);
		Case case7 = new Case(2,true,false);
		plateau.add(case7);
		Case case8 = new Case(4,false,false);
		plateau.add(case8);
		Case case9 = new Case(5,true,false);
		plateau.add(case9);
		Case case10 = new Case(5,true,true);
		plateau.add(case10);
		Case case11 = new Case(3,true,true);
		plateau.add(case11);
		Case case12 = new Case(5,true,true);
		plateau.add(case12);
		Case case13 = new Case(4,true,true);
		plateau.add(case13);
		Case case14 = new Case(5,true,true);
		plateau.add(case14);
		Case case15 = new Case(4,true,true);
		plateau.add(case15);
		Case case16 = new Case(5,true,true);
		plateau.add(case16);
		Case case17 = new Case(4,true,true);
		plateau.add(case17);
		Case case18 = new Case(5,true,true);
		plateau.add(case18);
		Case case19 = new Case(2,true,true);
		plateau.add(case19);
		Case case20 = new Case(4,true,true);
		plateau.add(case20);
		Case case21 = new Case(5,true,true);
		plateau.add(case21);
		Case case22 = new Case(5,true,true);
		plateau.add(case22);
		Case case23 = new Case(4,true,true);
		plateau.add(case23);
		Case case24 = new Case(5,true,true);
		plateau.add(case24);
		Case case25 = new Case(3,true,true);
		plateau.add(case25);
		Case case26 = new Case(4,false,true);
		plateau.add(case26);
		Case case27 = new Case(4,false,true);
		plateau.add(case27);
		Case case28 = new Case(4,false,true);
		plateau.add(case28);
		Case case29 = new Case(5,true,true);
		plateau.add(case29);
		Case case30 = new Case(2,true,true);
		plateau.add(case30);
		Case case31 = new Case(5,false,true);
		plateau.add(case31);
	}
}
