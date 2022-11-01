import Tests.Software_testing;
import Tests.Unit_testing;

public class Clientapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Unit_testing a = new Unit_testing();
		a.test_module1();
		
		Unit_testing b = new Unit_testing();
		b.test_module1(true);
		
		Software_testing c = new Software_testing();
		c.Modules(10);
		
		Software_testing d = new Software_testing();
		c.Modules( );
	}

}
