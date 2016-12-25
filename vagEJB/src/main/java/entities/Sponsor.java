package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Sponsor implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSponsor;
	private String nameSponsor;
	private String entreprise;
	private String phonenumberSponsor;
	private String addressSponsor;
	private String location;
	
	public Sponsor(){}

	public int getIdSponsor() {
		return idSponsor;
	}

	public void setIdSponsor(int idSponsor) {
		this.idSponsor = idSponsor;
	}

	public String getNameSponsor() {
		return nameSponsor;
	}

	public void setNameSponsor(String nameSponsor) {
		this.nameSponsor = nameSponsor;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public String getPhonenumberSponsor() {
		return phonenumberSponsor;
	}

	public void setPhonenumberSponsor(String phonenumberSponsor) {
		this.phonenumberSponsor = phonenumberSponsor;
	}

	public String getAddressSponsor() {
		return addressSponsor;
	}

	public void setAddressSponsor(String addressSponsor) {
		this.addressSponsor = addressSponsor;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Sponsor(int idSponsor, String nameSponsor, String entreprise,
			String phonenumberSponsor, String addressSponsor, String location) {
		super();
		this.idSponsor = idSponsor;
		this.nameSponsor = nameSponsor;
		this.entreprise = entreprise;
		this.phonenumberSponsor = phonenumberSponsor;
		this.addressSponsor = addressSponsor;
		this.location = location;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((addressSponsor == null) ? 0 : addressSponsor.hashCode());
		result = prime * result
				+ ((entreprise == null) ? 0 : entreprise.hashCode());
		result = prime * result + idSponsor;
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result
				+ ((nameSponsor == null) ? 0 : nameSponsor.hashCode());
		result = prime
				* result
				+ ((phonenumberSponsor == null) ? 0 : phonenumberSponsor
						.hashCode());
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
		Sponsor other = (Sponsor) obj;
		if (addressSponsor == null) {
			if (other.addressSponsor != null)
				return false;
		} else if (!addressSponsor.equals(other.addressSponsor))
			return false;
		if (entreprise == null) {
			if (other.entreprise != null)
				return false;
		} else if (!entreprise.equals(other.entreprise))
			return false;
		if (idSponsor != other.idSponsor)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (nameSponsor == null) {
			if (other.nameSponsor != null)
				return false;
		} else if (!nameSponsor.equals(other.nameSponsor))
			return false;
		if (phonenumberSponsor == null) {
			if (other.phonenumberSponsor != null)
				return false;
		} else if (!phonenumberSponsor.equals(other.phonenumberSponsor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sponsor [idSponsor=" + idSponsor + ", nameSponsor="
				+ nameSponsor + ", entreprise=" + entreprise
				+ ", phonenumberSponsor=" + phonenumberSponsor
				+ ", addressSponsor=" + addressSponsor + ", location="
				+ location + "]";
	}
	
	
	
	
	

}
