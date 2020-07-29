package org.diabate.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.diabate.model.Article;
import org.diabate.model.util.Couleur;
import org.diabate.model.util.Taille;


public class TestArticleJPA {

	public static void main(String[] args) {
		Article article = new Article("Robes", "Robe mir", "1N54GG", Couleur.BLEU, Taille.M);
		Article article1 = new Article("Jupes", "Jupe mini à carreaux", "6F88DF", Couleur.BLANC, Taille.S);
		
		System.out.println("Avant persistence");
		System.out.println("Utilisateur : "+ article);
		System.out.println("Utilisateur : "+ article1);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyECom");
		System.out.println("EMF : "+ emf);
		
		EntityManager entitymanager = emf.createEntityManager();
		
		EntityTransaction transaction = entitymanager.getTransaction();
		
		transaction.begin();
		entitymanager.persist(article);
		entitymanager.persist(article1);
		/*UtilisateurDao utilisateurdao = new UtilisateurDao();
		utilisateurdao.create(utilisateur);*/
		transaction.commit();
		
		System.out.println("Après persistence");
		System.out.println("Utilisateur : "+ article);
		System.out.println("Utilisateur : "+ article1);
				
	}

}
