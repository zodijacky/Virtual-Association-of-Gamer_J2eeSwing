package services;

import java.util.List;

import javax.ejb.Remote;

import entities.ActiveMember;
import entities.Administrator;

@Remote
public interface AdministratorServicesRemote {
	
	Boolean addAdministrator(Administrator administrator);
	Boolean deleteAdministrator(Integer id);
	Boolean updateAdministrator(Administrator administrator);
	Administrator findAdministratorById(Integer id);
	List<Administrator> readAllAdministrator();

}
