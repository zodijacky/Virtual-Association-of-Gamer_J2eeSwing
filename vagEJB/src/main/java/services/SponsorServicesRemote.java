package services;

import java.util.List;

import javax.ejb.Remote;


import entities.Sponsor;

@Remote
public interface SponsorServicesRemote {
	
	Boolean addSponsor(Sponsor sponsor);
	Boolean deleteSponsor(Integer id);
	Boolean updateSponsor(Sponsor sponsor);
	Sponsor findSponsorById(Integer id);
	List<Sponsor> readAllSponsor();

}
