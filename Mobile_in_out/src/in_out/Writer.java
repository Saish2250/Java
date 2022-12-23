package in_out;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Writer {

	private List<Mobile> new_mobile= new ArrayList<>();
	
	public List<Mobile> getNew_mobile() {
		return new_mobile;
	}

	public void setNew_mobile(List<Mobile> new_mobile) {
		this.new_mobile = new_mobile;
	}

	public void print_out(String output) {
		try {
			PrintStream p1 = new PrintStream(new File(output));
			PrintStream out = System.out;
			
			System.setOut(p1);
				for(Mobile m : new_mobile) {
					System.out.println(m.getModel()+ ","+m.getBrand());
				}
				System.setOut(out);
				
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			
				System.out.println("Success writtern in "+output);
				System.out.println();
	
	}
}
}
