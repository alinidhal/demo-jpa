package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * Classe emprunt qui sert à enregistrer les emprunts des clients
 * @author nidhal
 *
 */
@Entity
@Table(name="EMPRUNT")
public class Emprunt {
	
	@Id
	@Column(name="ID")
	private int id;

	@Column(name="DATE_DEBUT")
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Column(name="DATE_FIN")
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@Column(name="DELAI")
	private int delai;
	
	
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	@ManyToMany(mappedBy = "emprunts")
	private List<Livre> livre = new ArrayList<Livre>() ;
	
	public Emprunt() {
		
	}

	

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", delai=" + delai
				+ ", client=" + client + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}



	public List<Livre> getLivre() {
		return livre;
	}



	public void setLivre(List<Livre> livre) {
		this.livre = livre;
	}


	
}
