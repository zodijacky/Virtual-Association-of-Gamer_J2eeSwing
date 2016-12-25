package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class ActiveMember  extends User implements Serializable{
	
	private boolean isVIP;
	//private static  List<String> positions = new ArrayList<String>();
	
	
	//relation 
	 @OneToMany(mappedBy="activeMember")
	    private List<Event> events ;
	 
	 @OneToMany(mappedBy="activeMember")
	    private List<Article> articles ;
	
	public ActiveMember(){}
	
	public ActiveMember (boolean isVIP){
		super();
		
		this.isVIP=isVIP;
		
	}

	public boolean isVIP() {
		return isVIP;
	}

	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}
	
	

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "ActiveMember [isVIP=" + isVIP + ", getIdUser()=" + getIdUser()
				+ ", getNameUser()=" + getNameUser() + ", getLogin()="
				+ getLogin() + ", getPassword()=" + getPassword()
				+ ", toString()=" + super.toString() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + "]";
	}

	public ActiveMember( String nameUser, String login,
			String password, boolean isVIP) {
		super(nameUser, login, password);
		this.isVIP = isVIP;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (isVIP ? 1231 : 1237);
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
		ActiveMember other = (ActiveMember) obj;
		if (isVIP != other.isVIP)
			return false;
		return true;
	}
	
	

}
