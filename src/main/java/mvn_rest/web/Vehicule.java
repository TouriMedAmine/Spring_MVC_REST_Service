package mvn_rest.web;

public class Vehicule {
	private Long id;
	private String codeInterne;
	private String immatriculation;
	
	public Vehicule() {
	// Constructeur vide utilisé par la librairie Jackson.
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeInterne() {
		return codeInterne;
	}
	public void setCodeInterne(String codeInterne) {
		this.codeInterne = codeInterne;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	

}
