package in_out;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
public class Writer extends Loader{



	public void print_out(String output, List<Mobile> data) {
		Boolean t=false;
		try {
			/**PrintStream p1;
			p1 = new PrintStream(new File(output));
			PrintStream out = System.out;
			
			System.setOut(p1);
				for(Mobile m : new_mobile) {
					System.out.println(m.getModel()+ ","+m.getBrand());
				}
				System.setOut(console);
				**/
			try (FileWriter fw = new FileWriter(new File(output))){
				for(Mobile mobile : data) {
					fw.write(mobile.getModel()+","+mobile.getBrand()+"\n");
				}
			}
			t=true;
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			if(t==true) {
				System.out.println("Success writtern in "+output);
				System.out.println();
			}
	}
}
	
}
