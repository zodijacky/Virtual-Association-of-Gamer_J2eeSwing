package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Tournament;
import entities.Training;

/**
 * Session Bean implementation class TournamentServices
 */
@Stateless
@LocalBean
public class TournamentServices implements TournamentServicesRemote {
	
	@PersistenceContext
	private EntityManager entityManager;


    /**
     * Default constructor. 
     */
    public TournamentServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addTournament(Tournament tournament) {
		Boolean b = false;
		try {
			entityManager.persist(tournament);
			b = true;
		} catch (Exception e) {
			System.err.println("erreur ...");
		}
		return b;
	}

	@Override
	public Boolean deleteTournament(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(entityManager.find(Tournament.class, id));
			b = true;
		} catch (Exception e) {
			System.err.println("erreur ...");
		}
		return b;
	}

	@Override
	public Boolean updateTournament(Tournament tournament) {
		Boolean b = false;
		try {
			entityManager.merge(tournament);
			b = true;
		} catch (Exception e) {
			System.err.println("erreur ...");
		}
		return b;
	}

	@Override
	public Tournament findTournamentById(Integer id) {
		return entityManager.find(Tournament.class, id);
	}

	@Override
	public List<Tournament> readAllTournament() {
		String jpql = "select t from Tournament t ";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

}
