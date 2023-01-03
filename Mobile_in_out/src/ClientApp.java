import java.util.ArrayList;
import java.util.List;

import database.Store;
import in_out.Loader;
import in_out.Mobile;
import in_out.Writer;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Mobile> mobileList = new ArrayList<>();
		
		Loader loaddata = new Loader();
		Writer writeData = new Writer();
		
//		Take input from file
		mobileList.addAll(loaddata.loadMobile("input.txt"));
		
//		generate output to file
		writeData.print_out("outputfile.txt", mobileList);
		
//		get mobile list
		displaylist(mobileList);
		
		Store s1 = new Store();
		s1.createNewTable();
		
		s1.insert("Google", "G5");
			}
	
	
	static void displaylist(List<Mobile> new_mobile) {
		for(Mobile m : new_mobile) {
			System.out.println(m.getModel()+ ","+m.getBrand());
		}
	}

}
