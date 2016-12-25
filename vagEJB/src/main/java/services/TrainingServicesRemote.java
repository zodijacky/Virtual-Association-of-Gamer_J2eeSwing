package services;

import java.util.List;

import javax.ejb.Remote;


import entities.Training;

@Remote
public interface TrainingServicesRemote {
	
	Boolean addTraining(Training training);
	Boolean deleteTraining(Integer id);
	Boolean updateTraining(Training training);
	Training findTrainingById(Integer id);
	List<Training> readAllTraining();

}
