package oc;

public class Con1 {
	public static void main(String[] args) {
		Obj1 p1 = new Obj1();
		
		System.out.println("Id = "+p1.id);
		
		
		Obj1 p2 = new Obj1();
		System.out.println("Product Name: "+p2.pro_name);
		
		Obj1 p3 = new Obj1();
		System.out.println(p3.Even_or_Odd(5));
		
		Obj1 p4 = new Obj1();
		System.out.println("Product is "+p4.products("iPhone14",  "10"));
		
		Obj1 e1 = new Obj1();
		e1.employee("John");
	}

}
