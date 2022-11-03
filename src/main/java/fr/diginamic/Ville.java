package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VILLES")
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "NOM")
	private String nom;

	@Column(name = "CODE_POSTAL")
	private int codePostal;

	@Column(name = "DATE_DERNIER_RECENSEMENT")
	private Date dateDernierRecensement;

	@Column(name = "CATEGORIE")
	@Enumerated(EnumType.STRING)
	private Categorie categorie;

	@ManyToOne
	@JoinColumn(name = "ID_REGION")
	private Region region;

	@ManyToMany
	@JoinTable(name = "VILLE_HABITANT", 
	joinColumns = @JoinColumn(name = "ID_VILLE", referencedColumnName = "ID"), 
	inverseJoinColumns = @JoinColumn(name = "ID_HABITANT", referencedColumnName = "ID"))
	private List<Habitant> habitants = new ArrayList<Habitant>();

	public Ville() {
		super();
	}

	@Override
	public String toString() {
		return "Ville [id=" + id + ", nom=" + nom + ", codePostal=" + codePostal + ", dateDernierRecensement="
				+ dateDernierRecensement + ", categorie=" + categorie + ", region=" + region + ", habitants=" + habitants
				+ "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public Date getDateDernierRecensement() {
		return dateDernierRecensement;
	}

	public void setDateDernierRecensement(Date dateDernierRecensement) {
		this.dateDernierRecensement = dateDernierRecensement;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie grande) {
		this.categorie = grande;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public List<Habitant> getHabitants() {
		return habitants;
	}

	public void setHabitants(List<Habitant> habitants) {
		this.habitants = habitants;
	}

	

	

}
