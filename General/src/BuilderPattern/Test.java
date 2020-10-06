package BuilderPattern;

public class Test {

	
	public static void main(String[] args) {
		Phone phone= new PhoneBuilder().setBattery(12).setOs("Android").getPhone();
		System.out.println(phone.getBattery());
	}
}
