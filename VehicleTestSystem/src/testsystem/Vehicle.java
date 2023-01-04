package testsystem;

public class Vehicle {
	private Integer noOfTyres;
	private Integer noOfDoors;
	private String color;

	public Vehicle() {
		super();
	}
	
	public void startVehicle() {
		System.out.println("Starting vehicle");
	}
	
	public void startVehicle(Boolean keeles) {
		System.out.println("Starting vehicle keeless");
	}
	
	public Integer getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(Integer noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	public Integer getNoOfTyres() {
		return noOfTyres;
	}

	public void setNoOfTyres(Integer noOfTyres) {
		this.noOfTyres = noOfTyres;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
