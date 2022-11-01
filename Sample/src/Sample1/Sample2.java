package Sample1;
import java.util.*;

public class Sample2 {
	public static void main(String[] args) {
	System.out.println("Enter num1");
	Scanner sc= new Scanner(System.in);
	int num1=sc.nextInt();
	
	
	System.out.println("Enter num2");
	int num2=sc.nextInt();
	
	
	int add=num1+num2;
	System.out.println("Addition = "+ add);
	sc.close();
	}

}
