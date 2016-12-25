package entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Advertisement implements Serializable {
	
	private String photoAdvertisement;
	private String descriptionAdvertisement;
	private Event event;
	private Sponsor sponsor;
	private AdvertisementPK advertisementPK;
	
	public Advertisement(){}
	
	


	public String getPhotoAdvertisement() {
		return photoAdvertisement;
	}

	public void setPhotoAdvertisement(String photoAdvertisement) {
		this.photoAdvertisement = photoAdvertisement;
	}

	public String getDescriptionAdvertisement() {
		return descriptionAdvertisement;
	}

	public void setDescriptionAdvertisement(String descriptionAdvertisement) {
		this.descriptionAdvertisement = descriptionAdvertisement;
	}
	@ManyToOne
	@JoinColumn(name = "idEvent", referencedColumnName = "idEvent", insertable = false, updatable = false)
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	@ManyToOne
	@JoinColumn(name = "idSponsor", referencedColumnName = "idSponsor", insertable = false, updatable = false)
	public Sponsor getSponsor() {
		return sponsor;
	}

	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}


	
	@EmbeddedId
	public AdvertisementPK getAdvertisementPK() {
		return advertisementPK;
	}




	public void setAdvertisementPK(AdvertisementPK advertisementPK) {
		this.advertisementPK = advertisementPK;
	}




	public Advertisement(String photoAdvertisement,
			String descriptionAdvertisement, Event event, Sponsor sponsor) {
		super();
		this.photoAdvertisement = photoAdvertisement;
		this.descriptionAdvertisement = descriptionAdvertisement;
		this.event = event;
		this.sponsor = sponsor;
		this.advertisementPK = new AdvertisementPK(event.getIdEvent(),
			sponsor.getIdSponsor());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((descriptionAdvertisement == null) ? 0
						: descriptionAdvertisement.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime
				* result
				+ ((photoAdvertisement == null) ? 0 : photoAdvertisement
						.hashCode());
		result = prime * result + ((sponsor == null) ? 0 : sponsor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Advertisement other = (Advertisement) obj;
		if (descriptionAdvertisement == null) {
			if (other.descriptionAdvertisement != null)
				return false;
		} else if (!descriptionAdvertisement
				.equals(other.descriptionAdvertisement))
			return false;
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (photoAdvertisement == null) {
			if (other.photoAdvertisement != null)
				return false;
		} else if (!photoAdvertisement.equals(other.photoAdvertisement))
			return false;
		if (sponsor == null) {
			if (other.sponsor != null)
				return false;
		} else if (!sponsor.equals(other.sponsor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Advertisement [photoAdvertisement=" + photoAdvertisement
				+ ", descriptionAdvertisement=" + descriptionAdvertisement
				+ ", event=" + event + ", sponsor=" + sponsor + "]";
	}
	
	
	

}
