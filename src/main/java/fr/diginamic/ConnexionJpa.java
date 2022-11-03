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
		
		Region region = new Region();
		region.setNom("Bouche du Rhone");
		region.setDateCreation(new Date());
		em.persist(region);
		
		Ville ville = new Ville();
		ville.setNom("Marseille");
		ville.setCodePostal(13000);
		ville.setDateDernierRecensement(new Date());
		ville.setCategorie(Categorie.GRANDE);
		ville.setRegion(region);
		em.persist(ville);
		
		Habitant habitant = new Habitant();
		habitant.setNom("Martin");
		habitant.setPrenom("Raissa");
		em.persist(habitant);
		
		ville.getHabitants().add(habitant);
		
		
		tr.commit();
		
//		Region r1 = em.find(Region.class, 1);
//		System.out.println(r1);
		
	}

}
