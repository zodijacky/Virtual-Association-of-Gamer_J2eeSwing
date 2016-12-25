package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Administrator;
import entities.Advertisement;

@Remote
public interface AdvertisementServicesRemote {
	
	Boolean addAdvertisement(Advertisement advertisement);
	Boolean deleteAdvertisement(Integer id);
	Boolean updateAdvertisement(Advertisement advertisement);
	Advertisement findAdvertisementById(Integer id);
	List<Advertisement> readAllAdvertisement();

}
