package Juice_Milkshake;
import java.util.*;
import java.util.ArrayList;

public class Customer {
	
	void ask() {
	System.out.println("What drinks you have");
	}
  
	
	void drinking(){
		System.out.println("Drinks the drink");
	}
	
	
	public static void main(String [] args) {
	
		Shop s2= new Shop();
		s2.welcome();
		
		Customer c1 = new Customer();
		c1.ask();
		Drink d3=new Milkshake();
		d3.available();
		Shopkeeper s4 = new Shopkeeper();
		s4.service1();
		Shop d=new Shop();
		List<String> adrink = new ArrayList<>();
		adrink.add("Mango Shake");
		adrink.add("Pineapple Juice");
		adrink.add("chikoo shake");
		List<Drink> dri = d.order(adrink);
		System.out.println(adrink);

		
		Shopkeeper s1 = new Shopkeeper();
		s1.service2();
		
		Shop s0 = new Shop();
		s0.service4();
		Shopkeeper s3 = new Shopkeeper();
		s3.service3();
		Customer c2 = new Customer();
		c2.drinking();
		
	}
}

