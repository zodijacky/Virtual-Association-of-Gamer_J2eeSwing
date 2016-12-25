package services;

import java.util.List;

import javax.ejb.Remote;

import entities.ActiveMember;

@Remote
public interface ActiveMemberServicesRemote {
	Boolean addActiveMember(ActiveMember activeMember);
	Boolean deleteActiveMember(Integer id);
	Boolean updateActiveMember(ActiveMember activeMember);
	ActiveMember findActiveMemberById(Integer id);
	List<ActiveMember> readAllActiveMember();
	

}
