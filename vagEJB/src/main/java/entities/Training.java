package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Training extends Event implements Serializable {
	private String trainer;
	
	public Training(){}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Training(String nameEvent, Date dateBeginEvent,
			Date dateEndEvent, String descriptionEvent, String placeEvent,
			Date timeBeginEvent, Date timeEndEvent, String trainer) {
		super( nameEvent, dateBeginEvent, dateEndEvent,
				descriptionEvent, placeEvent, timeBeginEvent, timeEndEvent);
		this.trainer = trainer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Training other = (Training) obj;
		if (trainer == null) {
			if (other.trainer != null)
				return false;
		} else if (!trainer.equals(other.trainer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Training [trainer=" + trainer + ", getIdEvent()="
				+ getIdEvent() + ", getNameEvent()=" + getNameEvent()
				+ ", getDateBeginEvent()=" + getDateBeginEvent()
				+ ", getDateEndEvent()=" + getDateEndEvent()
				+ ", getDescriptionEvent()=" + getDescriptionEvent()
				+ ", getPlaceEvent()=" + getPlaceEvent()
				+ ", getTimeBeginEvent()=" + getTimeBeginEvent()
				+ ", getTimeEndEvent()=" + getTimeEndEvent() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	

}
