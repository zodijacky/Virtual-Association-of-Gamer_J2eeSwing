package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entities.Gamer;

/**
 * Session Bean implementation class GamerServices
 */
@Stateless
@LocalBean
public class GamerServices implements GamerServicesRemote {

    /**
     * Default constructor. 
     */
    public GamerServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addGamer(Gamer gamer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteGamer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateGamer(Gamer gamer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gamer findGamerById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gamer> readAllGamer() {
		// TODO Auto-generated method stub
		return null;
	}

}
