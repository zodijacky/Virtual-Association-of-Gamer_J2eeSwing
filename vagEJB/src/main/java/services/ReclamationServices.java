package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entities.Reclamation;

/**
 * Session Bean implementation class ReclamationServices
 */
@Stateless
@LocalBean
public class ReclamationServices implements ReclamationServicesRemote {

    /**
     * Default constructor. 
     */
    public ReclamationServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addReclamation(Reclamation reclamation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteReclamation(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateReclamation(Reclamation reclamation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reclamation findReclamationById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reclamation> readAllReclamation() {
		// TODO Auto-generated method stub
		return null;
	}

}
