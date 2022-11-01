import MPA.Mobile;

//import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import MPA.MIS;

public class Clientapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MIS m= new MIS();
		
		
		List<Mobile> mlist = new ArrayList<>();
		Mobile m2 = new Mobile();
		m2.setBrandname("Samsung");
		mlist.add(m2);
		
		List<Mobile> modlist = new ArrayList<>();
		m2.setBrandname("Samsung");
		modlist.add(m2);
		
		Mobile m4 = new Mobile();
		m4.setBrandname("Google");
		mlist.add(m4);
	
		m.setBrandname1(mlist);
		
	
		
		System.out.println(m.getBrandname1().get(0).getBrandname());
		System.out.println(m.getBrandname1().get(1).getBrandname());
		
	

	
		
		
		//Map <String, Mobile> 
	}

}
