package FactoryPattern;

public class Factory {
	
	
	public static Shape getShape(String shape) {
		
		switch(shape) {
		case "Rectangle":
			return new Rectangle();
			
		case "Square":
			return new Square();
		}
		
		return null;
	}

}
