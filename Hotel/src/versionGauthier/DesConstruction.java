package versionGauthier;

public class DesConstruction extends Des{
	
	public DesConstruction(){
		setIdDe(0);
		setNomDe("");
	}
	
	public DesConstruction(int id, String nom){
		setIdDe(id);
		setNomDe(nom);
	}

	public int lancer() {
		int nombreDes = (int)(Math.random()*6+1);
		
		return nombreDes;
	}
	
	
}
