package in_out;
import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
//import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


public class Loader{
	
	Scanner sc;
	File fileImpl;
	
	
	
	Boolean t=false;

	public List<Mobile> loadMobile(String file) {
	List<Mobile> data= new ArrayList<>();
	try{
		
		fileImpl = new File("Inputimp.txt");
		sc=new Scanner(fileImpl);
		while(sc.hasNextLine()) {
			String records = sc.nextLine();
			//System.out.println(records);
			String recordfields[];
			recordfields=records.split(",");
			Mobile m= new Mobile(recordfields[0],recordfields[1]);
			data.add(m);
		}
		t=true;
	}catch(Exception e) {
	e.printStackTrace();
	}finally {
		if(t==true) {
		System.out.println("Input successfully written in file");
		System.out.println();
		}
	}
	return data;
	}
	
	
}