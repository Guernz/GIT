package versionGauthier;

public class Main {
	
	public static void main(String[] args) {
		DesConstruction desClassique = new DesConstruction(1, "D�s classique");
		DesConstruction desConstruction = new DesConstruction(1, "D�s de construction");
		
		System.out.println(desClassique.lancer());
		System.out.println(desConstruction.lancer());
		
	}
	
	

	
}

