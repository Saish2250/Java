package Juice_Milkshake;
import java.util.*;

public class Shop {
	
	private String drink_name;
    
    Drink drink2;
	
		void welcome(){
		System.out.println("---------Welcome to Spot Drinking Center-------------");
		
		System.out.println("-----------We Serve you best drinks------------------");
		}
		
		void service4() {
			
			List<String> adrink = new ArrayList<>();
			adrink.add("Mango Shake");
			adrink.add("Pineapple Juice");
			adrink.add("chikoo shake");
			System.out.println(adrink+" are  ready");
		}
		 public List<Drink> order(List<String> drink2){
				
			
				Integer n =drink2.size();
				List<Drink> dri = new ArrayList<>();
				
				for(int i=0;i<n;i++)
				{
					this.drink_name =drink2.get(i);
				
				if(drink_name=="Mango Shake") {
					Milkshake d1 = new Milkshake();
					d1.setPrice(70);
					 d1.setQuantity("250 ml");
					//System.out.println(d1.getPrice());
					dri.add(d1);
					this.drink2=d1;
				}else if(drink_name=="banana shake") {
					Milkshake d1 = new Milkshake();
					d1.setPrice(50);
					 d1.setQuantity("250 ml");
					//System.out.println(d1.getPrice()+" ");
					dri.add(d1);
					this.drink2=d1;
					
				}else if(drink_name=="strawberry shake") {
					Milkshake d1 = new Milkshake();
					 d1.setQuantity("250 ml");
					d1.setPrice(60);
					//System.out.println("It will cost "+d1.getPrice()+" ");
					dri.add(d1);
					
					this.drink2=d1;
				}else if(drink_name=="chikoo shake") {
					Milkshake d1 = new Milkshake();
					 d1.setQuantity("250 ml");
					d1.setPrice(50);
					//System.out.println("It will cost "+d1.getPrice()+" ");
					dri.add(d1);
					this.drink2=d1;
				}
				
				else if(drink_name=="Pineapple Juice") {
						Milkshake d1 = new Milkshake();
						d1.setPrice(50);
						 d1.setQuantity("250 ml");
						//System.out.println("It will cost "+d1.getPrice()+" ");
						dri.add(d1);
						this.drink2=d1;
						
						
					}else if(drink_name=="Lime Juice") {
						Milkshake d1 = new Milkshake();
						 d1.setQuantity("250 ml");
						d1.setPrice(60);
						dri.add(d1);
						this.drink2=d1;
						}
					else if(drink_name=="Mango Juice") {
						Milkshake d1 = new Milkshake();
						 d1.setQuantity("250 ml");
						d1.setPrice(60);
						dri.add(d1);
						this.drink2=d1;
						}
					else if(drink_name=="Apple Juice") {
						Milkshake d1 = new Milkshake();
						 d1.setQuantity("250 ml");
						d1.setPrice(60);
						dri.add(d1);
						this.drink2=d1;
						}
					else {
						System.out.println("Drink not availble");
					}
				
				}
				return dri;	


}
}