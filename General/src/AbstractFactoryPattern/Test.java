package AbstractFactoryPattern;

public class Test {

	public static void main(String[] args) {
		
		
		AbstractFactory factory = FactoryProducer.getFactory(true);
		factory.getFactory("Circle");

	}

}
