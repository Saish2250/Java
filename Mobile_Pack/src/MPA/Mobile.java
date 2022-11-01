package MPA;

//import java.util.Map;

public class Mobile {
	private String brandname;
	private Integer price;
	private String modelname;
	
	//quantative attributes
	Integer camera;
	Integer ram;
	Integer size;
	String resolution;
	
	//qualitative attributes
	String version;
	Boolean android;
	String processor;
	
	
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	
	
	
	//p<String,String> ma = new Map<String,String>();
}
