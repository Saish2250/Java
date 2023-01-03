package Laptop;

public class Laptop {
	private String brandName,modelName,OS;
	private Integer sellingPrice,storage;
	public Boolean storageSSD;
	private Double ScreenSize;
	
	public Laptop(String brandName, String modelName, Integer sellingPrice, Double ScreenSize, Integer storage,Boolean isStorageSSD,String OS)
	{
		this.setBrandName(brandName);
		this.setModelName(modelName);
		this.setSellingPrice(sellingPrice);
		this.setScreenSize(ScreenSize);
		this.storageSSD=isStorageSSD;
		this.setOS(OS);
		this.setStorageCapacity(storage);
	}
	public Boolean getStorageSSD() {
		return storageSSD;
	}

	public void setStorageSSD(Boolean storageSSD) {
		this.storageSSD = storageSSD;
	}
	public Double getScreenSize() {
		return ScreenSize;
	}

	public void setScreenSize(Double screenSize) {
		ScreenSize = screenSize;
	}

	public Integer getStorage() {
		return storage;
	}

	public void setStorageCapacity(Integer storage) {
		this.storage = storage;
	}

	public Integer getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
}
