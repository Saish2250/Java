package Juice_Milkshake;

public class Shop {
	public static void main(String [] args) {
		
		System.out.println("Welcome to Spot Drinking Center");
		System.out.println("We Serve you best drinks");
		
		Customer c1 = new Customer();
		c1.ask();
		Shopkeeper s = new Shopkeeper();
		s.service1();
		Drink d=new Milkshake();
		d.order("Juice");
		Drink d1=new Milkshake();
		d1.order("Mango Shake");
		Shopkeeper s1 = new Shopkeeper();
		s1.service2();
		Shopkeeper s3 = new Shopkeeper();
		s3.service3();
		Customer c2 = new Customer();
		c2.drinking();
		
	}

}
