package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entities.Advertisement;

/**
 * Session Bean implementation class AdvertisementServices
 */
@Stateless
@LocalBean
public class AdvertisementServices implements AdvertisementServicesRemote {

    /**
     * Default constructor. 
     */
    public AdvertisementServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addAdvertisement(Advertisement advertisement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteAdvertisement(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateAdvertisement(Advertisement advertisement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertisement findAdvertisementById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> readAllAdvertisement() {
		// TODO Auto-generated method stub
		return null;
	}

}
