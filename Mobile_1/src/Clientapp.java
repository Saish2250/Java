import Moblie1.Featurephone;
import Moblie1.Smart_enabled_phone;

public class Clientapp {
	
	public static void main(String [] args) {
		//Smart_enabled_phone s1= new Smart_enabled_phone();

		Featurephone a = new Smart_enabled_phone();
		a.installation();
		
		Featurephone b = new Featurephone();
		b.installation(true);
		
		Smart_enabled_phone c = new Smart_enabled_phone();
		c.feature(128);
		
		Smart_enabled_phone d = new Smart_enabled_phone();
		d.installation();
	}

}
