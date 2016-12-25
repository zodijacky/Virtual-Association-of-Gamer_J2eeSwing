package services;

import java.util.List;

import javax.ejb.Remote;


import entities.Gamer;

@Remote
public interface GamerServicesRemote {
	
	Boolean addGamer(Gamer gamer);
	Boolean deleteGamer(Integer id);
	Boolean updateGamer(Gamer gamer);
	Gamer findGamerById(Integer id);
	List<Gamer> readAllGamer();

}
