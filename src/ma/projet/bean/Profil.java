package ma.projet.bean;

public class Profil {
	protected int id;
	protected String code;
	protected String libelle;

	private static int comp;

	public Profil(String code, String libelle) {
		this.id = ++comp;
		this.code = code;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
