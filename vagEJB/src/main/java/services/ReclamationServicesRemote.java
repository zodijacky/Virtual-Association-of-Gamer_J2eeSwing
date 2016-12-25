package services;

import java.util.List;

import javax.ejb.Remote;


import entities.Reclamation;

@Remote
public interface ReclamationServicesRemote {
	Boolean addReclamation(Reclamation reclamation);
	Boolean deleteReclamation(Integer id);
	Boolean updateReclamation(Reclamation reclamation);
	Reclamation findReclamationById(Integer id);
	List<Reclamation> readAllReclamation();

}
