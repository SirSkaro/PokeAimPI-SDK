package skaro.pokeaimpi.sdk.resource;

import java.util.Date;

public class BadgeAwardRecord {
	
	private User user;
	private Badge badge;
	private Date awardDate;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Badge getBadge() {
		return badge;
	}
	public void setBadge(Badge badge) {
		this.badge = badge;
	}
	public Date getAwardDate() {
		return awardDate;
	}
	public void setAwardDate(Date awardDate) {
		this.awardDate = awardDate;
	}
	
}
