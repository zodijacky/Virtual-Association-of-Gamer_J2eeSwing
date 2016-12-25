package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
@Entity

public class Tournament extends Event implements Serializable{
	private String game;
	
	public Tournament(){}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	

	

	public Tournament(String nameEvent, Date dateBeginEvent, Date dateEndEvent,
			String descriptionEvent, String placeEvent, Date timeBeginEvent,
			Date timeEndEvent, String type, ActiveMember activeMember,
			List<Participation> participations, List<Comment> comments,
			List<Advertisement> advertisements, String game) {
		super(nameEvent, dateBeginEvent, dateEndEvent, descriptionEvent,
				placeEvent, timeBeginEvent, timeEndEvent, type, activeMember,
				participations, comments, advertisements);
		this.game = game;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((game == null) ? 0 : game.hashCode());
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
		Tournament other = (Tournament) obj;
		if (game == null) {
			if (other.game != null)
				return false;
		} else if (!game.equals(other.game))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tounament [game=" + game + ", getIdEvent()=" + getIdEvent()
				+ ", getNameEvent()=" + getNameEvent()
				+ ", getDateBeginEvent()=" + getDateBeginEvent()
				+ ", getDateEndEvent()=" + getDateEndEvent()
				+ ", getDescriptionEvent()=" + getDescriptionEvent()
				+ ", getPlaceEvent()=" + getPlaceEvent()
				+ ", getTimeBeginEvent()=" + getTimeBeginEvent()
				+ ", getTimeEndEvent()=" + getTimeEndEvent() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	

}
