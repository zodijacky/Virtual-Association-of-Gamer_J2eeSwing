package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entities.ActiveMember;

/**
 * Session Bean implementation class ActiveMemberServices
 */
@Stateless
@LocalBean
public class ActiveMemberServices implements ActiveMemberServicesRemote {

    /**
     * Default constructor. 
     */
    public ActiveMemberServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addActiveMember(ActiveMember activeMember) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteActiveMember(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateActiveMember(ActiveMember article) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActiveMember findActiveMemberById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActiveMember> readAllActiveMember() {
		// TODO Auto-generated method stub
		return null;
	}

}
