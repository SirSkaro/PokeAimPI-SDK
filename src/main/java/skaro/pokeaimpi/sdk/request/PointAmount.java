package skaro.pokeaimpi.sdk.request;

import javax.validation.constraints.Positive;

public class PointAmount {

	@Positive(message = "amount must be a positive value")
	private Integer amount;

	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
}
