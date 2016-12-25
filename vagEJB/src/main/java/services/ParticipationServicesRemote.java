package services;

import java.util.List;

import javax.ejb.Remote;


import entities.Participation;

@Remote
public interface ParticipationServicesRemote {

	Boolean addParticipation(Participation participation);
	Boolean deleteParticipation(Integer id);
	Boolean updateParticipation(Participation participation);
	Participation findParticipationById(Integer id);
	List<Participation> readAllParticipation();
	
}
