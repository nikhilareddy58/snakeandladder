package Singleton;

public class Singleton {
	
	
	public static Singleton s= new Singleton();
	
	public String str;
	
	private Singleton() {
		System.out.println("Printed only once..test");
	}
	
	public static Singleton getInstance() {
		if(s==null)
			return new Singleton();
		else
			return s;
	}

}
