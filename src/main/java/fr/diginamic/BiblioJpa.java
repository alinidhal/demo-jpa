package fr.diginamic;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BiblioJpa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("recensement");
		EntityManager em = factory.createEntityManager();


		Livre livre = em.find(Livre.class, 3);
		System.out.println(livre);
		
		for (Emprunt emp: livre.getEmprunts()) {
			System.out.println(emp); 
		}
		
			
		
	
	
		
	}

}
