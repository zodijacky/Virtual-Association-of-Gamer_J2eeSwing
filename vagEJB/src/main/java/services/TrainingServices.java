package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Event;
import entities.Training;

/**
 * Session Bean implementation class TrainingServices
 */
@Stateless
@LocalBean
public class TrainingServices implements TrainingServicesRemote {
	@PersistenceContext
	private EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public TrainingServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addTraining(Training training) {
		Boolean b = false;
		try {
			entityManager.persist(training);
			b = true;
		} catch (Exception e) {
			System.err.println("erreur ...");
		}
		return b;
	}

	@Override
	public Boolean deleteTraining(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(entityManager.find(Training.class, id));
			b = true;
		} catch (Exception e) {
			System.err.println("erreur ...");
		}
		return b;
	}

	@Override
	public Boolean updateTraining(Training training) {
		Boolean b = false;
		try {
			entityManager.merge(training);
			b = true;
		} catch (Exception e) {
			System.err.println("erreur ...");
		}
		return b;
	}

	@Override
	public Training findTrainingById(Integer id) {
		return entityManager.find(Training.class, id);
	}

	@Override
	public List<Training> readAllTraining() {
		String jpql = "select t from Training t ";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

}
