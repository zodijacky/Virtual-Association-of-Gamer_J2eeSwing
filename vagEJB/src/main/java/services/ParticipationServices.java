package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entities.Participation;

/**
 * Session Bean implementation class ParticipationServices
 */
@Stateless
@LocalBean
public class ParticipationServices implements ParticipationServicesRemote {

    /**
     * Default constructor. 
     */
    public ParticipationServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addParticipation(Participation participation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteParticipation(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateParticipation(Participation participation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Participation findParticipationById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Participation> readAllParticipation() {
		// TODO Auto-generated method stub
		return null;
	}

}
