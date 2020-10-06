package AbstractFactoryPattern;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(boolean isRounded) {
		
		if(isRounded) {
			return new RoundedFactory();
		}else {
			return new NonRoundedFactory();
		}
	}

}
