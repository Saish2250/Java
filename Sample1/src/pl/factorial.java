package pl;

public class factorial {
	public static void main(String[] args){
		fac(5);
		
	}
	
	static void fac(int n) {
		int i,fact=1;
		for(i=n;i>0;i--)
		
		{
			fact= fact * i;
			
			
		}
		System.out.println("Factorial = "+fact);
		
		
	}

}
