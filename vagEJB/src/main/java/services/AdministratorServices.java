package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entities.Administrator;

/**
 * Session Bean implementation class AdministratorServices
 */
@Stateless
@LocalBean
public class AdministratorServices implements AdministratorServicesRemote {

    /**
     * Default constructor. 
     */
    public AdministratorServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addAdministrator(Administrator administrator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteAdministrator(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateAdministrator(Administrator administrator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrator findAdministratorById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Administrator> readAllAdministrator() {
		// TODO Auto-generated method stub
		return null;
	}

}
