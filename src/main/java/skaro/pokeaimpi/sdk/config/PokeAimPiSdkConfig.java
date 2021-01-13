package skaro.pokeaimpi.sdk.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients
public class PokeAimPiSdkConfig {
	
	@Bean
	@ConfigurationProperties("skaro.pokeaimpi.sdk")
	public PokeAimPiProperties getProperties() {
		return new PokeAimPiProperties();
	}
	
}
