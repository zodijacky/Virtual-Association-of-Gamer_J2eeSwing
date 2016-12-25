package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity

public class Administrator  extends User  implements Serializable{
	
	private int voteNumber;
	private Date administrationYear;
	
	
	
	@ManyToOne
    private	Reclamation reclamation;
	
	
	public Administrator(){}


	public int getVoteNumber() {
		return voteNumber;
	}


	public void setVoteNumber(int voteNumber) {
		this.voteNumber = voteNumber;
	}


	public Date getAdministrationYear() {
		return administrationYear;
	}


	public void setAdministrationYear(Date administrationYear) {
		this.administrationYear = administrationYear;
	}


	public Reclamation getReclamation() {
		return reclamation;
	}


	public void setReclamation(Reclamation reclamation) {
		this.reclamation = reclamation;
	}


	public Administrator( String nameUser, String login,
			String password, int voteNumber, Date administrationYear) {
		super(nameUser, login, password);
		this.voteNumber = voteNumber;
		this.administrationYear = administrationYear;
	}


	public Administrator(String nameUser, String login, String password,
			String role, String type, int voteNumber, Date administrationYear,
			Reclamation reclamation) {
		super(nameUser, login, password, role, type);
		this.voteNumber = voteNumber;
		this.administrationYear = administrationYear;
		this.reclamation = reclamation;
	}


	@Override
	public String toString() {
		return "Administrator [voteNumber=" + voteNumber
				+ ", administrationYear=" + administrationYear
				+ ", getIdUser()=" + getIdUser() + ", getNameUser()="
				+ getNameUser() + ", getLogin()=" + getLogin()
				+ ", getPassword()=" + getPassword() + ", toString()="
				+ super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((administrationYear == null) ? 0 : administrationYear
						.hashCode());
		result = prime * result + voteNumber;
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
		Administrator other = (Administrator) obj;
		if (administrationYear == null) {
			if (other.administrationYear != null)
				return false;
		} else if (!administrationYear.equals(other.administrationYear))
			return false;
		if (voteNumber != other.voteNumber)
			return false;
		return true;
	}





	
	
	
	

}
