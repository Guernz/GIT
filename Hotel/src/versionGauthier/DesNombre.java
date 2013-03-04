package versionGauthier;

public class DesNombre extends Des{
	public DesNombre(){
		setIdDe(0);
		setNomDe("");
	}
	
	public DesNombre(int id, String nom){
		setIdDe(id);
		setNomDe(nom);
	}

	public int lancer() {
		int nombreDes = (int)(Math.random()*6+1);
		
		return nombreDes;
	}
	
}
