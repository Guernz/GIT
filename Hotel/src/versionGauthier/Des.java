package versionGauthier;

public abstract class Des {
	private static int idDe;
	private static String nomDe;
	
	public int getIdDe() {
		return idDe;
	}

	public void setIdDe(int id) {
		idDe = id;
	}

	public String getNomDe() {
		return nomDe;
	}

	public void setNomDe(String nom) {
		nomDe = nom;
	}

	public abstract int lancer();
	
}
