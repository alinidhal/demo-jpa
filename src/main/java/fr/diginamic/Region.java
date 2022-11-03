package fr.diginamic;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="REGIONS")

public class Region {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id; 
	
	@Column(name="NOM")
	private String nom;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name="DATE_CREATION")
	private Date dateCreation;
	
	@OneToMany(mappedBy = "region")
	private List<Ville> villes = new ArrayList<Ville>();
	
	public Region() {
		super();
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
	@Override
	public String toString() {
		return "Region [id=" + id + ", nom=" + nom + "]";
	}

	public void setDateCreation(Date date) {
		
	}

	
	
	
}
