package AbstractFactoryPattern;

public class NonRoundedFactory implements AbstractFactory{

	@Override
	public Shape getFactory(String type) {
		
		
		switch(type) {
		case "Rectangle":
			return new Rectangle();
		case "Square":
			return new Square();
		}
		
		
		return null;
	}
	
	

}
