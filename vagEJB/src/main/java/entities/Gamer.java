package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Gamer extends User implements Serializable {

	private int trophiesNumber;
	
	//List<Participation> participations = new ArrayList<>();

	// RELATION
	@ManyToOne
	private Reclamation reclamation;

	public Gamer() {
	}

	/*@OneToMany(mappedBy="gamer")
	public List<Participation> getParticipations() {
		return participations;
	}

	public void setParticipations(List<Participation> participations) {
		this.participations = participations;
	}*/

	public int getTrophiesNumber() {
		return trophiesNumber;
	}

	public void setTrophiesNumber(int trophiesNumber) {
		this.trophiesNumber = trophiesNumber;
	}

	public Reclamation getReclamation() {
		return reclamation;
	}

	public void setReclamation(Reclamation reclamation) {
		this.reclamation = reclamation;
	}

	public Gamer(String nameUser, String login, String password,
			int trophiesNumber) {
		super(nameUser, login, password);
		this.trophiesNumber = trophiesNumber;
	}

	@Override
	public String toString() {
		return "Gamer [trophiesNumber=" + trophiesNumber + ", getIdUser()="
				+ getIdUser() + ", getNameUser()=" + getNameUser()
				+ ", getLogin()=" + getLogin() + ", getPassword()="
				+ getPassword() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + trophiesNumber;
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
		Gamer other = (Gamer) obj;
		if (trophiesNumber != other.trophiesNumber)
			return false;
		return true;
	}

}
