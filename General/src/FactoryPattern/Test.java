package FactoryPattern;

public class Test {

	
	
	public static void main(String[] args) {
		
		Shape shape = Factory.getShape("Square");
		shape.show();
		
	}
}
