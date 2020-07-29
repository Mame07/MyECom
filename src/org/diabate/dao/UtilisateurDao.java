package org.diabate.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.persistence.NoResultException;
//import javax.persistence.Query;

import org.diabate.model.Utilisateur;

@Stateless
public class UtilisateurDao {
	
	 private static final String JPQL_SELECT_PAR_EMAIL = "SELECT u FROM Utilisateur u WHERE u.email=:email";
	 private static final String PARAM_EMAIL     = "email";

	    // Injection du manager, qui s'occupe de la connexion avec la BDD
	    @PersistenceContext( unitName = "MyECom" )
	    private EntityManager em;

	    // Enregistrement d'un nouvel utilisateur
	    public void create( Utilisateur utilisateur ) throws DAOException 
	    {
	        try {
	            em.persist( utilisateur );
	        } catch ( Exception e ) {
	            throw new DAOException( e );
	        }
	    }

	    // Recherche d'un utilisateur à partir de son adresse email
	  /*  public Utilisateur trouver( String email ) throws DAOException {
	        Utilisateur utilisateur = null;
	        Query requete = em.createQuery( JPQL_SELECT_PAR_EMAIL );
	        requete.setParameter( PARAM_EMAIL, email );
	        try {
	            utilisateur = (Utilisateur) requete.getSingleResult();
	        } catch ( NoResultException e ) {
	            return null;
	        } catch ( Exception e ) {
	            throw new DAOException( e );
	        }
	        return utilisateur;
	    }*/
	
	
	//Utilisateur read( String email, String motdepasse) throws DAOException;
	

}
