import java.util.List;

//import in_out.Loader;
import in_out.Mobile;
import in_out.Writer;
import in_out.Database_conn;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Loader l1 = new Loader();
		//l1.exep_handle();
		
		Writer w1 = new Writer();
		w1. print_out("Outputimp.txt");
		displaylist(w1.getNew_mobile());
		
		Database_conn d1 = new Database_conn();
		Database_conn.connect();
	}
	
	
	static void displaylist(List<Mobile> new_mobile) {
		for(Mobile m : new_mobile) {
			System.out.println(m.getModel()+ ","+m.getBrand());
		}
	}

}
