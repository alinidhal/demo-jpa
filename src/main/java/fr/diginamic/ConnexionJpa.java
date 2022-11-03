package fr.diginamic;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("recensement");
		EntityManager em = factory.createEntityManager();

		EntityTransaction tr = em.getTransaction();

		tr.begin();
		
		//Creation d'un livre
		Livre livre = new Livre();
		em.persist(livre);
//
//		// Création d'une region
//		Region region = new Region();
//		region.setNom("Bouche du Rhone");
//		region.setDateCreation(new Date());
//		em.persist(region);
//
//		// Création d'une ville
//		Ville marseille = new Ville();
//		marseille.setNom("Marseille");
//		marseille.setCodePostal(13001);
//		marseille.setDateDernierRecensement(new Date());
//		marseille.setCategorie(Categorie.GRANDE);
//		marseille.setRegion(region);
//		em.persist(marseille);
//
//		// Création d'une ville
//		Ville aubagne = new Ville();
//		aubagne.setNom("Aubagne");
//		aubagne.setCodePostal(13400);
//		aubagne.setDateDernierRecensement(new Date());
//		aubagne.setCategorie(Categorie.MOYENNE);
//		aubagne.setRegion(region);
//		em.persist(aubagne);
//
//		// Création d'un habitant
//		Habitant kassimeNidhal = new Habitant();
//		kassimeNidhal.setNom("Kassime");
//		kassimeNidhal.setPrenom("Nidhal");
//		em.persist(kassimeNidhal);
//
//		// Ajout d'un habitant dans une ville
//		marseille.getHabitants().add(kassimeNidhal);
//
//		Habitant martinRaissa = new Habitant();
//		martinRaissa.setNom("Martin");
//		martinRaissa.setPrenom("Raissa");
//		em.persist(martinRaissa);
//
//		aubagne.getHabitants().add(martinRaissa);

		tr.commit();


		Livre livre2 = em.find(Livre.class, 1);
		System.out.println(livre2);
	}

}
