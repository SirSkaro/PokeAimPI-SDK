package skaro.pokeaimpi.sdk.resource;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class UserProgress {

	private User user;
	private Badge nextBadge;
	private Badge currentHighestBadge;
	private Integer pointsToNextReward;
	private Integer currentPoints;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Badge getNextBadge() {
		return nextBadge;
	}
	public void setNextBadge(Badge nextBadge) {
		this.nextBadge = nextBadge;
	}
	public Badge getCurrentHighestBadge() {
		return currentHighestBadge;
	}
	public void setCurrentHighestBadge(Badge currentHighestBadge) {
		this.currentHighestBadge = currentHighestBadge;
	}
	public Integer getPointsToNextReward() {
		return pointsToNextReward;
	}
	public void setPointsToNextReward(Integer pointToNextReward) {
		this.pointsToNextReward = pointToNextReward;
	}
	public Integer getCurrentPoints() {
		return currentPoints;
	}
	public void setCurrentPoints(Integer currentPoints) {
		this.currentPoints = currentPoints;
	}
	
}
