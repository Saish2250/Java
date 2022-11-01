package Juice_Milkshake;

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
		Shopkeeper s = new Shopkeeper();
		s.service1();
		Shop d=new Shop();
		d.order("Juice");
		Shop d1=new Shop();
		d1.order("Mango Shake");
		Shopkeeper s1 = new Shopkeeper();
		s1.service2();
		Shopkeeper s3 = new Shopkeeper();
		s3.service3();
		Customer c2 = new Customer();
		c2.drinking();
		
	}
}

