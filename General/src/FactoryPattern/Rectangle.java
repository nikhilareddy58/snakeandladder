package FactoryPattern;

public class Rectangle implements Shape{

	public Rectangle() {
		System.out.println("Rectangle here....");
	}

	@Override
	public void show() {
		System.out.println("In show method, Rectangle here....");
		
	}
}
