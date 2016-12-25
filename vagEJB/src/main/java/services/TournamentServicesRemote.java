package services;

import java.util.List;

import javax.ejb.Remote;


import entities.Tournament;

@Remote
public interface TournamentServicesRemote {
	
	Boolean addTournament(Tournament tournament);
	Boolean deleteTournament(Integer id);
	Boolean updateTournament(Tournament tournament);
	Tournament findTournamentById(Integer id);
	List<Tournament> readAllTournament();


}
