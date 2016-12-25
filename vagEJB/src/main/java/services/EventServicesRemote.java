package services;

import java.util.List;

import javax.ejb.Remote;


import entities.Event;

@Remote
public interface EventServicesRemote {
	Boolean addEvent(Event event);
	Boolean deleteEvent(Integer id);
	Boolean updateEvent(Event event);
	Event findEventById(Integer id);
	List<Event> readAllEvent();


}
