package skaro.pokeaimpi.sdk.config;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PokeAimPiSdkMessagingConfig {
	public static final String BADGE_FANOUT_BEAN = "badgeFanoutExchange";
	private static final String BADGE_FANOUT = "pokeaimpi.badges";
	
	@Bean(BADGE_FANOUT_BEAN)
	@Autowired
	public FanoutExchange getFanoutExchange() {
		return new FanoutExchange(BADGE_FANOUT);
	}
	
}
