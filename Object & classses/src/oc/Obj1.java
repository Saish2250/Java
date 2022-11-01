package oc;

public class Obj1 {
	Integer id = 10;
	String pro_name = "iPods";
	
	
	String Even_or_Odd(Integer n) {
		if(n%2==0) {
		return "Number is even";
		}
		else {
			return "Number is odd";
		}
	}	
		
	String products(String name, String no) {
		return name + no;
	}
	
	void employee(String ename)
	{
		System.out.println("Employee is "+ename);
	}
	
	
}
