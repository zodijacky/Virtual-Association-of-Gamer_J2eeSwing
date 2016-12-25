package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Training;
import entities.User;

@Remote
public interface UserServicesRemote {
	
	Boolean addUser(User user);
	Boolean deleteUser(Integer id);
	Boolean updateUser(User user);
	User findUserById(Integer id);
	List<User> readAllUser();

}
