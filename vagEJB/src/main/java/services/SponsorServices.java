package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entities.Sponsor;

/**
 * Session Bean implementation class SponsorServices
 */
@Stateless
@LocalBean
public class SponsorServices implements SponsorServicesRemote {

    /**
     * Default constructor. 
     */
    public SponsorServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addSponsor(Sponsor sponsor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteSponsor(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateSponsor(Sponsor sponsor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sponsor findSponsorById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sponsor> readAllSponsor() {
		// TODO Auto-generated method stub
		return null;
	}

}
