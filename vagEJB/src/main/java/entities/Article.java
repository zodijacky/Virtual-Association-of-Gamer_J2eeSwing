package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Article implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idArticle;
	private String titleArticle;
	private Date dateArticle;
	private String descriptionArticle;
	
	
	
	//relation
	@ManyToOne
    private	ActiveMember activeMember;
	
	
	public int getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	public String getTitleArticle() {
		return titleArticle;
	}
	public void setTitleArticle(String titleArticle) {
		this.titleArticle = titleArticle;
	}
	public Date getDateArticle() {
		return dateArticle;
	}
	public void setDateArticle(Date dateArticle) {
		this.dateArticle = dateArticle;
	}
	public String getDescriptionArticle() {
		return descriptionArticle;
	}
	public void setDescriptionArticle(String descriptionArticle) {
		this.descriptionArticle = descriptionArticle;
	}
	

	
	public ActiveMember getActiveMember() {
		return activeMember;
	}
	public void setActiveMember(ActiveMember activeMember) {
		this.activeMember = activeMember;
	}
	
	
	
	
	public Article(String titleArticle, Date dateArticle,
			String descriptionArticle, ActiveMember activeMember) {
		super();
		this.titleArticle = titleArticle;
		this.dateArticle = dateArticle;
		this.descriptionArticle = descriptionArticle;
		this.activeMember = activeMember;
	}
	public Article(){}
	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", titleArticle="
				+ titleArticle + ", dateArticle=" + dateArticle
				+ ", descriptionArticle=" + descriptionArticle
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateArticle == null) ? 0 : dateArticle.hashCode());
		result = prime
				* result
				+ ((descriptionArticle == null) ? 0 : descriptionArticle
						.hashCode());
		result = prime * result + idArticle;
		result = prime * result
				+ ((titleArticle == null) ? 0 : titleArticle.hashCode());
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
		Article other = (Article) obj;
		if (dateArticle == null) {
			if (other.dateArticle != null)
				return false;
		} else if (!dateArticle.equals(other.dateArticle))
			return false;
		if (descriptionArticle == null) {
			if (other.descriptionArticle != null)
				return false;
		} else if (!descriptionArticle.equals(other.descriptionArticle))
			return false;
		if (idArticle != other.idArticle)
			return false;
		if (titleArticle == null) {
			if (other.titleArticle != null)
				return false;
		} else if (!titleArticle.equals(other.titleArticle))
			return false;
		return true;
	}
	
	

}
