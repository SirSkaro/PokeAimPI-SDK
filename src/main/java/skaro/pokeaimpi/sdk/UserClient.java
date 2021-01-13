package skaro.pokeaimpi.sdk;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import skaro.pokeaimpi.sdk.request.PointAmount;
import skaro.pokeaimpi.sdk.resource.NewAwardList;
import skaro.pokeaimpi.sdk.resource.User;
import skaro.pokeaimpi.sdk.resource.UserProgress;

@FeignClient(value = "users", url = "#{@pokeAimPiProperties.getBaseUri()}" + "/user")
public interface UserClient {
	@GetMapping("/discord/{discordId}")
	Optional<User> getByDiscordId(@RequestParam("discordId") String discordId);
	
	@PostMapping("/discord/{discordId}/points/add")
	NewAwardList addPointsViaDiscordId(@RequestParam("discordId") String discordId, @RequestBody PointAmount amount);
	
	@GetMapping("/discord/{id}/progress")
	UserProgress getUserProgress(@RequestParam("id") String discordId);
}
