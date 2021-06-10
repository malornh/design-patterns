package abstractfactory;

public class FactoryProducer {
	
	
	public static AbstractFactory getFactory(String factoryName) {
		
		if(factoryName == "SHAPE") {
			return new ShapeFactory();
		}
		
		if(factoryName == "COLOR") {
			return new ColorFactory();
		}
		
		System.out.println("Unknown factory name");
		return null;
	}

}
