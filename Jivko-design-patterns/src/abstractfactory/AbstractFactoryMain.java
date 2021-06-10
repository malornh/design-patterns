package abstractfactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();

	}

}
