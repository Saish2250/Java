package Juice_Milkshake;

public class Milkshake extends Drink{
	private String quantity;
	private Integer price;
	public Milkshake(){

	
	}

	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}
