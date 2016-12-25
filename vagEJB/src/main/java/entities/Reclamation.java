package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Reclamation implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReclamation;
	private String subjectReclamation;
	private String descriptionReclamation;
	private String answerReclamation;
	private Date dateReclamation;

	
	
	//relation 
		@ManyToOne
	    private	Gamer gamer;
	
		
		@ManyToOne
	    private	Administrator administrator;
	
	public Reclamation(){}

	public int getIdReclamation() {
		return idReclamation;
	}

	public void setIdReclamation(int idReclamation) {
		this.idReclamation = idReclamation;
	}

	public String getSubjectReclamation() {
		return subjectReclamation;
	}

	public void setSubjectReclamation(String subjectReclamation) {
		this.subjectReclamation = subjectReclamation;
	}

	public String getDescriptionReclamation() {
		return descriptionReclamation;
	}

	public void setDescriptionReclamation(String descriptionReclamation) {
		this.descriptionReclamation = descriptionReclamation;
	}

	public String getAnswerReclamation() {
		return answerReclamation;
	}

	public void setAnswerReclamation(String answerReclamation) {
		this.answerReclamation = answerReclamation;
	}

	public Date getDateReclamation() {
		return dateReclamation;
	}

	public void setDateReclamation(Date dateReclamation) {
		this.dateReclamation = dateReclamation;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	

	
	
	
	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	public Reclamation(int idReclamation, String subjectReclamation,
			String descriptionReclamation, String answerReclamation,
			Date dateReclamation, Gamer gamer, Administrator administrator) {
		super();
		this.idReclamation = idReclamation;
		this.subjectReclamation = subjectReclamation;
		this.descriptionReclamation = descriptionReclamation;
		this.answerReclamation = answerReclamation;
		this.dateReclamation = dateReclamation;
		this.gamer = gamer;
		this.administrator = administrator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((administrator == null) ? 0 : administrator.hashCode());
		result = prime
				* result
				+ ((answerReclamation == null) ? 0 : answerReclamation
						.hashCode());
		result = prime * result
				+ ((dateReclamation == null) ? 0 : dateReclamation.hashCode());
		result = prime
				* result
				+ ((descriptionReclamation == null) ? 0
						: descriptionReclamation.hashCode());
		result = prime * result + ((gamer == null) ? 0 : gamer.hashCode());
		result = prime * result + idReclamation;
		result = prime
				* result
				+ ((subjectReclamation == null) ? 0 : subjectReclamation
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
		Reclamation other = (Reclamation) obj;
		if (administrator == null) {
			if (other.administrator != null)
				return false;
		} else if (!administrator.equals(other.administrator))
			return false;
		if (answerReclamation == null) {
			if (other.answerReclamation != null)
				return false;
		} else if (!answerReclamation.equals(other.answerReclamation))
			return false;
		if (dateReclamation == null) {
			if (other.dateReclamation != null)
				return false;
		} else if (!dateReclamation.equals(other.dateReclamation))
			return false;
		if (descriptionReclamation == null) {
			if (other.descriptionReclamation != null)
				return false;
		} else if (!descriptionReclamation.equals(other.descriptionReclamation))
			return false;
		if (gamer == null) {
			if (other.gamer != null)
				return false;
		} else if (!gamer.equals(other.gamer))
			return false;
		if (idReclamation != other.idReclamation)
			return false;
		if (subjectReclamation == null) {
			if (other.subjectReclamation != null)
				return false;
		} else if (!subjectReclamation.equals(other.subjectReclamation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reclamation [idReclamation=" + idReclamation
				+ ", subjectReclamation=" + subjectReclamation
				+ ", descriptionReclamation=" + descriptionReclamation
				+ ", answerReclamation=" + answerReclamation
				+ ", dateReclamation=" + dateReclamation + ", gamer=" + gamer
				+ ", administrator=" + administrator + "]";
	}
	
	
	

}
