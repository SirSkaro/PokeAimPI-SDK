package skaro.pokeaimpi.sdk;

public class BadgeAwardRecordQuery {
	private String badgeId;
	private String userId;
	private String userDiscordId;
	private String discordRoleId;
	
	public String getBadgeId() {
		return badgeId;
	}
	public void setBadgeId(String badgeId) {
		this.badgeId = badgeId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserDiscordId() {
		return userDiscordId;
	}
	public void setUserDiscordId(String userDiscordId) {
		this.userDiscordId = userDiscordId;
	}
	public String getDiscordRoleId() {
		return discordRoleId;
	}
	public void setDiscordRoleId(String discordRoleId) {
		this.discordRoleId = discordRoleId;
	}
}
