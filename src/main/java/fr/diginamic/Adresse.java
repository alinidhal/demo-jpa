package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

	@Column(name="NOM_COMPLET_ADRESSE")
	private String nomCompletAdress;
	
	@Column(name="CODE_POSTAL")
	private int codePostal;
	
	@Column(name="VILLE")
	private String ville;
	
	public Adresse() {
		
	}

	public String getNomCompletAdress() {
		return nomCompletAdress;
	}

	public void setNomCompletAdress(String nomCompletAdress) {
		this.nomCompletAdress = nomCompletAdress;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}
