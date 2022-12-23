package in_out;

public class Mobile {

	private String brand, model;
	public String getBrand() {
		return brand;
	}
	public Mobile(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
