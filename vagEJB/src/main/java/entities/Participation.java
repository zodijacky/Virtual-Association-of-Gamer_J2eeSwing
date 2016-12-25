package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Participation implements Serializable {
	private Date dateParticipation;

	private Gamer gamer;
	private Event event;
	private ParticipationPK participationPK;

	public Participation() {
	}

	public Participation(Date dateParticipation, Gamer gamer, Event event) {
		super();
		this.dateParticipation = dateParticipation;
		this.gamer = gamer;
		this.event = event;
		this.participationPK = new ParticipationPK(event.getIdEvent(),
				gamer.getIdUser());

	}

	public Date getDateParticipation() {
		return dateParticipation;
	}

	public void setDateParticipation(Date dateParticipation) {
		this.dateParticipation = dateParticipation;
	}

	public Participation(Date dateParticipation, Event event, Gamer gamer) {
		super();
		this.dateParticipation = dateParticipation;

	}

	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "idUSer", insertable = false, updatable = false)
	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	@EmbeddedId
	public ParticipationPK getParticipationPK() {
		return participationPK;
	}

	public void setParticipationPK(ParticipationPK participationPK) {
		this.participationPK = participationPK;
	}

	@ManyToOne
	@JoinColumn(name = "idEvent", referencedColumnName = "idEvent", insertable = false, updatable = false)
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}


	@Override
	public String toString() {
		return "Participation [dateParticipation=" + dateParticipation
				+ ", gamer=" + gamer + ", event=" + event + "]";
	}

}
