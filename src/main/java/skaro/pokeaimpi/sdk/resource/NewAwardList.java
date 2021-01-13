package skaro.pokeaimpi.sdk.resource;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class NewAwardList {

	private User user;
	private List<Badge> badges;
	private Date awardDate;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Badge> getBadges() {
		return badges;
	}
	public void setBadges(List<Badge> badges) {
		this.badges = badges;
	}
	public Date getAwardDate() {
		return awardDate;
	}
	public void setAwardDate(Date awardDate) {
		this.awardDate = awardDate;
	}
	
}
