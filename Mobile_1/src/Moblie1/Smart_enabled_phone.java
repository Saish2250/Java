package Moblie1;

public class Smart_enabled_phone extends Featurephone implements Smartfeatures{

	@Override
	public void feature(Integer storage) {
		System.out.println("Feature.................. "+storage);
		
	}
	public void installation() {
		System.out.println("...Installing apps....");
		
		System.out.println(".............. "+getClass()+" .................");
	}
}
