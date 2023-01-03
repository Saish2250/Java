package Laptop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LaptopDB {
	private Map<String, Laptop> laptops = new HashMap<String,Laptop>();
	public LaptopDB(Map<String, Laptop> laptopList) {
		// TODO Auto-generated constructor stub
		this.laptops = laptopList;
	}
	public Map<String, Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(HashMap<String, Laptop> laptops) {
		this.laptops = laptops;
	}
	
	public ArrayList<Laptop> listAllLaptops(){
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key,value) -> {
			allLaptops.add(value);
		});
		return allLaptops;
	}
	
	public ArrayList<Laptop> filterByBrand(String brand) {
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key, value) -> {
			if (value.getBrandName() == brand) {
				allLaptops.add(value);
			}
		});
		return allLaptops;
	}
	
	public ArrayList<Laptop> filterBySellingPrice(Boolean less,Integer Amount){
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key,value) -> {
			if(less) {
				if(value.getSellingPrice()<=Amount) {
					allLaptops.add(value);
					}
				}else {
					if(value.getSellingPrice() >= Amount) {
						allLaptops.add(value);
					}
				}
		});
		return allLaptops;
	}
	
	public ArrayList<Laptop> filterByScreenSize(Boolean less,Integer size){
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key,value) -> {
			if(less) {
				if(value.getScreenSize()<=size) {
					allLaptops.add(value);
					}
				}else {
					if(value.getScreenSize() >= size) {
						allLaptops.add(value);
					}
				}
		});
		return allLaptops;
	}
	
	public ArrayList<Laptop> filterByStorageCapacity(Integer storage){
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key,value) -> {
	
				if(value.getStorage()>=storage) {
					allLaptops.add(value);
					}
				
		});
		return allLaptops;
	}
	
	public ArrayList<Laptop> filterBySSD(Boolean isSSD){
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key,value) -> {
			if(isSSD) {
				if(value.getStorageSSD()) {
					allLaptops.add(value);
					}
				}else {
					if(!value.getStorageSSD()) {
						allLaptops.add(value);
					}
				}
		});
		return allLaptops;
	}
	
	public ArrayList<Laptop> filterByOS(String OS){
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key,value) -> {
	
				if(value.getOS()==OS) {
					allLaptops.add(value);
					}
				
		});
		return allLaptops;
	}
	
	public ArrayList<Laptop> searchModel(String model){
		ArrayList<Laptop> allLaptops = new ArrayList<>();
		laptops.forEach((key,value) -> {
	
				if(value.getModelName()==model) {
					allLaptops.add(value);
					}
				
		});
		return allLaptops;
	}
}
