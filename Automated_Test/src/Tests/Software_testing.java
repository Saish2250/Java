package Tests;


public class Software_testing extends Unit_testing implements Integration{

	@Override
	public void Modules(Integer modules) {
		System.out.println("................ "+modules);
		
	}
	
	public void Modules() {
		System.out.println("...testing module2....");
		
		System.out.println(".............. "+getClass()+" .................");
	}

}
