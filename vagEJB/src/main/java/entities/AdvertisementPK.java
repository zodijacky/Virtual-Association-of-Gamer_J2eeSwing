package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class AdvertisementPK implements Serializable {
	@Column(name="idSponsor")
	private int idSponsor;
	@Column(name="idEvent")
	private int idEvent;
	public int getIdSponsor() {
		return idSponsor;
	}
	public void setIdSponsor(int idSponsor) {
		this.idSponsor = idSponsor;
	}
	public int getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}
	public AdvertisementPK(int idSponsor, int idEvent) {
		super();
		this.idSponsor = idSponsor;
		this.idEvent = idEvent;
	}
	
	public AdvertisementPK(){
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEvent;
		result = prime * result + idSponsor;
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
		AdvertisementPK other = (AdvertisementPK) obj;
		if (idEvent != other.idEvent)
			return false;
		if (idSponsor != other.idSponsor)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AdvertisementPK [idSponsor=" + idSponsor + ", idEvent="
				+ idEvent + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
