package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Event implements Serializable {
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEvent;
	private String nameEvent;
	private Date dateBeginEvent;
	private Date dateEndEvent;
	private String descriptionEvent;
	private String placeEvent;
	private Date timeBeginEvent;
	private Date timeEndEvent;
	private String type;
	
	@ManyToOne
    private	ActiveMember activeMember;
	
	//relation 
	@OneToMany(mappedBy="event")
	List<Participation> participations = new ArrayList<>();	
	
	
	@OneToMany(mappedBy="event")
	List<Comment> comments = new ArrayList<>();	

	@OneToMany(mappedBy="event")
	List<Advertisement> advertisements = new ArrayList<>();	
	
	
	
	
	public List<Participation> getParticipations() {
		return participations;
	}
	public void setParticipations(List<Participation> participations) {
		this.participations = participations;
	}
	public int getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}
	public String getNameEvent() {
		return nameEvent;
	}
	public void setNameEvent(String nameEvent) {
		this.nameEvent = nameEvent;
	}
	public Date getDateBeginEvent() {
		return dateBeginEvent;
	}
	public void setDateBeginEvent(Date dateBeginEvent) {
		this.dateBeginEvent = dateBeginEvent;
	}
	
	
	
	
	public ActiveMember getActiveMember() {
		return activeMember;
	}
	public void setActiveMember(ActiveMember activeMember) {
		this.activeMember = activeMember;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateEndEvent() {
		return dateEndEvent;
	}
	public void setDateEndEvent(Date dateEndEvent) {
		this.dateEndEvent = dateEndEvent;
	}
	public String getDescriptionEvent() {
		return descriptionEvent;
	}
	public void setDescriptionEvent(String descriptionEvent) {
		this.descriptionEvent = descriptionEvent;
	}
	public String getPlaceEvent() {
		return placeEvent;
	}
	public void setPlaceEvent(String placeEvent) {
		this.placeEvent = placeEvent;
	}
	public Date getTimeBeginEvent() {
		return timeBeginEvent;
	}
	public void setTimeBeginEvent(Date timeBeginEvent) {
		this.timeBeginEvent = timeBeginEvent;
	}
	public Date getTimeEndEvent() {
		return timeEndEvent;
	}
	public void setTimeEndEvent(Date timeEndEvent) {
		this.timeEndEvent = timeEndEvent;
	}
	

	
	
	
	public Event(String nameEvent, Date dateBeginEvent, Date dateEndEvent,
			String descriptionEvent, String placeEvent, Date timeBeginEvent,
			Date timeEndEvent, String type, ActiveMember activeMember,
			List<Participation> participations, List<Comment> comments,
			List<Advertisement> advertisements) {
		super();
		this.nameEvent = nameEvent;
		this.dateBeginEvent = dateBeginEvent;
		this.dateEndEvent = dateEndEvent;
		this.descriptionEvent = descriptionEvent;
		this.placeEvent = placeEvent;
		this.timeBeginEvent = timeBeginEvent;
		this.timeEndEvent = timeEndEvent;
		this.type = type;
		this.activeMember = activeMember;
		this.participations = participations;
		this.comments = comments;
		this.advertisements = advertisements;
	}
	
	
	
	
	
	public Event(String nameEvent, Date dateBeginEvent, Date dateEndEvent,
			String descriptionEvent, String placeEvent, Date timeBeginEvent,
			Date timeEndEvent) {
		super();
		this.nameEvent = nameEvent;
		this.dateBeginEvent = dateBeginEvent;
		this.dateEndEvent = dateEndEvent;
		this.descriptionEvent = descriptionEvent;
		this.placeEvent = placeEvent;
		this.timeBeginEvent = timeBeginEvent;
		this.timeEndEvent = timeEndEvent;
	}
	public Event(int idEvent, String nameEvent, Date dateBeginEvent,
			Date dateEndEvent, String descriptionEvent, String placeEvent,
			Date timeBeginEvent, Date timeEndEvent, String type,
			List<Participation> participations, List<Comment> comments,
			List<Advertisement> advertisements, ActiveMember activeMember) {
		super();
		this.idEvent = idEvent;
		this.nameEvent = nameEvent;
		this.dateBeginEvent = dateBeginEvent;
		this.dateEndEvent = dateEndEvent;
		this.descriptionEvent = descriptionEvent;
		this.placeEvent = placeEvent;
		this.timeBeginEvent = timeBeginEvent;
		this.timeEndEvent = timeEndEvent;
		this.type = type;
		this.participations = participations;
		this.comments = comments;
		this.advertisements = advertisements;
		this.activeMember = activeMember;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateBeginEvent == null) ? 0 : dateBeginEvent.hashCode());
		result = prime * result
				+ ((dateEndEvent == null) ? 0 : dateEndEvent.hashCode());
		result = prime
				* result
				+ ((descriptionEvent == null) ? 0 : descriptionEvent.hashCode());
		result = prime * result + idEvent;
		result = prime * result
				+ ((nameEvent == null) ? 0 : nameEvent.hashCode());
		result = prime * result
				+ ((placeEvent == null) ? 0 : placeEvent.hashCode());
		result = prime * result
				+ ((timeBeginEvent == null) ? 0 : timeBeginEvent.hashCode());
		result = prime * result
				+ ((timeEndEvent == null) ? 0 : timeEndEvent.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Event [idEvent=" + idEvent + ", nameEvent=" + nameEvent
				+ ", dateBeginEvent=" + dateBeginEvent + ", dateEndEvent="
				+ dateEndEvent + ", descriptionEvent=" + descriptionEvent
				+ ", placeEvent=" + placeEvent + ", timeBeginEvent="
				+ timeBeginEvent + ", timeEndEvent=" + timeEndEvent + ", type="
				+ type + ", getClass()=" + getClass() + ", toString()="
				
				+ super.toString() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (dateBeginEvent == null) {
			if (other.dateBeginEvent != null)
				return false;
		} else if (!dateBeginEvent.equals(other.dateBeginEvent))
			return false;
		if (dateEndEvent == null) {
			if (other.dateEndEvent != null)
				return false;
		} else if (!dateEndEvent.equals(other.dateEndEvent))
			return false;
		if (descriptionEvent == null) {
			if (other.descriptionEvent != null)
				return false;
		} else if (!descriptionEvent.equals(other.descriptionEvent))
			return false;
		if (idEvent != other.idEvent)
			return false;
		if (nameEvent == null) {
			if (other.nameEvent != null)
				return false;
		} else if (!nameEvent.equals(other.nameEvent))
			return false;
		if (placeEvent == null) {
			if (other.placeEvent != null)
				return false;
		} else if (!placeEvent.equals(other.placeEvent))
			return false;
		if (timeBeginEvent == null) {
			if (other.timeBeginEvent != null)
				return false;
		} else if (!timeBeginEvent.equals(other.timeBeginEvent))
			return false;
		if (timeEndEvent == null) {
			if (other.timeEndEvent != null)
				return false;
		} else if (!timeEndEvent.equals(other.timeEndEvent))
			return false;
		return true;
	}
	
	public Event(){}
	
	

}
