package org.diabate.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.diabate.model.Utilisateur;

public class TestUtilisateurJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utilisateur utilisateur = new Utilisateur("Diabate", "Mariame", "mamediabate@gmail.com", "12345678", "0699745676");
		Utilisateur utilisateur1 = new Utilisateur("Gasnier", "johann", "johanngasnier@gmail.com", "0000123", "0799745677");
		
		System.out.println("Avant persistence");
		System.out.println("Utilisateur : "+ utilisateur);
		System.out.println("Utilisateur : "+ utilisateur1);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyECom");
		System.out.println("EMF : "+ emf);
		
		EntityManager entitymanager = emf.createEntityManager();
		
		EntityTransaction transaction = entitymanager.getTransaction();
		
		transaction.begin();
		entitymanager.persist(utilisateur);
		entitymanager.persist(utilisateur1);
		/*UtilisateurDao utilisateurdao = new UtilisateurDao();
		utilisateurdao.create(utilisateur);*/
		transaction.commit();
		
		System.out.println("Après persistence");
		System.out.println("Utilisateur : "+ utilisateur);
		System.out.println("Utilisateur : "+ utilisateur1);
				
	}

}
