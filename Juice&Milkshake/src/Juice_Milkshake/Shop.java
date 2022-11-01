package Juice_Milkshake;

public class Shop {
	private String drink_name;
    private String drink1 = "Milkshake";
	
		void welcome(){
		System.out.println("Welcome to Spot Drinking Center");
		
		System.out.println("We Serve you best drinks");
		}
		
		 void order(String drink_name){
				
				this.drink_name =drink_name;
				
				System.out.println("Choose a drink");
				System.out.println(this.drink_name);
				if(drink1 == "Milkshake") {
				if(drink_name=="Mango Shake") {
					Milkshake d1 = new Milkshake();
					d1.setPrice(70);
					 d1.setQuantity("250 ml");
					System.out.println("It will cost "+d1.getPrice()+" ");
					
				  
				}else if(drink_name=="banana shake") {
					Milkshake d1 = new Milkshake();
					d1.setPrice(50);
					 d1.setQuantity("250 ml");
					System.out.println("It will cost "+d1.getPrice()+" ");
					
					
					
				}else if(drink_name=="strawberry shake") {
					Milkshake d1 = new Milkshake();
					 d1.setQuantity("250 ml");
					d1.setPrice(60);
					System.out.println("It will cost "+d1.getPrice()+" ");
				}else if(drink_name=="chikoo shake") {
					Milkshake d1 = new Milkshake();
					 d1.setQuantity("250 ml");
					d1.setPrice(50);
					System.out.println("It will cost "+d1.getPrice()+" ");
				}
				
				else {
					System.out.println("Please select a drink");
					}
				}else if(drink1== "Juice") {
					if(drink_name=="Pineapple Juice") {
						Milkshake d1 = new Milkshake();
						d1.setPrice(50);
						 d1.setQuantity("250 ml");
						System.out.println("It will cost "+d1.getPrice()+" ");
						
						
						
					}else if(drink_name=="Lime Juice") {
						Milkshake d1 = new Milkshake();
						 d1.setQuantity("250 ml");
						d1.setPrice(60);
						}
					else if(drink_name=="Mango Juice") {
						Milkshake d1 = new Milkshake();
						 d1.setQuantity("250 ml");
						d1.setPrice(60);
						}
					else if(drink_name=="Apple Juice") {
						Milkshake d1 = new Milkshake();
						 d1.setQuantity("250 ml");
						d1.setPrice(60);
						}
					else {
						System.out.println("Drink not availble");
					}
				}else {
					System.out.println("Drink not availble");
				}
			}	

}
