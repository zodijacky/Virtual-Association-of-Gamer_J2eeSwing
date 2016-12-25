package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Comment implements Serializable{
	private Date dateComment;
	private String descriptionComment;
	private User user;
	private Event event;
	private CommentPK commentPK;
	
	public Comment(){}

	public Date getDateComment() {
		return dateComment;
	}

	public void setDateComment(Date dateComment) {
		this.dateComment = dateComment;
	}

	public String getDescriptionComment() {
		return descriptionComment;
	}

	public void setDescriptionComment(String descriptionComment) {
		this.descriptionComment = descriptionComment;
	}

	public Comment(Date dateComment, String descriptionComment) {
		super();
		this.dateComment = dateComment;
		this.descriptionComment = descriptionComment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateComment == null) ? 0 : dateComment.hashCode());
		result = prime
				* result
				+ ((descriptionComment == null) ? 0 : descriptionComment
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
		Comment other = (Comment) obj;
		if (dateComment == null) {
			if (other.dateComment != null)
				return false;
		} else if (!dateComment.equals(other.dateComment))
			return false;
		if (descriptionComment == null) {
			if (other.descriptionComment != null)
				return false;
		} else if (!descriptionComment.equals(other.descriptionComment))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comment [dateComment=" + dateComment + ", descriptionComment="
				+ descriptionComment + "]";
	}
	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "idUSer", insertable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	@ManyToOne
	@JoinColumn(name = "idEvent", referencedColumnName = "idEvent", insertable = false, updatable = false)
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Comment(Date dateComment, String descriptionComment, User user,
			Event event) {
		super();
		this.dateComment = dateComment;
		this.descriptionComment = descriptionComment;
		this.user = user;
		this.event = event;
		this.commentPK = new CommentPK(event.getIdEvent(),
				user.getIdUser());
	}
	
	
	@EmbeddedId
	public CommentPK getCommentPK() {
		return commentPK;
	}
	
	public void setCommentPK(CommentPK commentPK) {
		this.commentPK = commentPK;
	}

}
