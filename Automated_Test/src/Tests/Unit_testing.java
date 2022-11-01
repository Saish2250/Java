package Tests;



public class Unit_testing implements Automated_Platform{

	@Override
	public void test_module1() {
		System.out.println("......Testing Module1........");
		
	}
	public void test_module1(boolean a) {
		System.out.println(".............. "+getClass()+" .................");
		System.out.println("......Testing Module1........Results : "+a);
		
	}
}
