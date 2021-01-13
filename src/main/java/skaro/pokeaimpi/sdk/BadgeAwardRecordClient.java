package skaro.pokeaimpi.sdk;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import skaro.pokeaimpi.sdk.resource.BadgeAwardRecord;

@FeignClient(value = "awards", url = "#{@pokeAimPiProperties.getBaseUri()}" + "/award")
public interface BadgeAwardRecordClient {
	@GetMapping
	List<BadgeAwardRecord> getAll();
	
	@GetMapping
	List<BadgeAwardRecord> getAll(@SpringQueryMap BadgeAwardRecordQuery query);
	
	@PostMapping("/discord/user/{userDiscordId}/role/{discordRoleId}")
	BadgeAwardRecord createBadge(@RequestParam("userDiscordId") String userDiscordId, String discordRoleId);
}
