package AbstractFactoryPattern;

public class RoundedFactory implements AbstractFactory{

	@Override
	public Shape getFactory(String type) {
		
		switch(type) {
		case "Circle":
			return new Circle();
		}
		
		
		return null;
	}

}
