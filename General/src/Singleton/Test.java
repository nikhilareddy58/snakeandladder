package Singleton;


public class Test {

	public static void main(String[] args) {
		
		Singleton s= Singleton.getInstance();
		s.str="nik";
		Singleton s2= Singleton.getInstance();
		Singleton s3= Singleton.getInstance();
		Singleton s4= Singleton.getInstance();
		Singleton s5= Singleton.getInstance();
		System.out.println("Str: "+s5.str);

	}

}
