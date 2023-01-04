package testsystem;

public class Sedan extends Car implements EV{
	private String color;
	private Integer noOfTyres;
	private Integer noOfDoors;
	
	public Sedan() {
		super();
	}
	
	public Sedan(Integer noOfTyres, Integer noOfDoors, String color) {
		super();
		this.noOfTyres = noOfTyres;
		this.color = color;
		this.noOfDoors = noOfDoors;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getNoOfTyres() {
		return noOfTyres;
	}

	public void setNoOfTyres(Integer noOfTyres) {
		this.noOfTyres = noOfTyres;
	}

	public Integer getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(Integer noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	

}
