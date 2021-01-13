package skaro.pokeaimpi.sdk;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import skaro.pokeaimpi.sdk.resource.Badge;

@FeignClient(value = "badges", url = "#{@pokeAimPiProperties.getBaseUri()}" + "/badge")
public interface BadgeClient {
	@GetMapping("/{id}")
	Badge getByBadgeId(@RequestParam("id") String badgeId);
	
	@GetMapping("/discord/{discordRoleId}")
	Badge getByDiscordRoleId(@RequestParam("discordRoleId") String discordRoleId);
	
	@PostMapping
	Badge createBadge(@RequestBody Badge badge);
}
