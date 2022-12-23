package in_out;
import java.util.Scanner;
import java.io.File;
//import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


public class Loader {
	
	Scanner sc;
	File fileImpl;
	
	List<Mobile> new_mobile= new ArrayList<>();
	
	public List<Mobile> getNew_mobile() {
		return new_mobile;
	}

	public void setNew_mobile(List<Mobile> new_mobile) {
		this.new_mobile = new_mobile;
	}

	public List<String> exep_handle() {
	try{
		fileImpl = new File("Inputimp");
		sc=new Scanner(fileImpl);
		while(sc.hasNextLine()) {
			String records = sc.nextLine();
			//System.out.println(records);
			String recordfields[] = records.split(",");
			return new_mobile.add(new Mobile(recordfields[0],recordfields[1]));
		}
	}catch(Exception e) {
	e.printStackTrace();
	}finally {
		
		System.out.println("Input successfully written in file");
		System.out.println();
	
	}

	}
	

}