package abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String colorName) {
		// Shape factory cannot return instance of color
		return null;
	}

	@Override
	Shape getShape(String shapeName) {
		
		if(shapeName == "SQUARE") {
			return new Square();
		}
		
		if(shapeName == "CIRCLE") {
			return new Circle();
		}
		
		if(shapeName == "RECTANGLE") {
			return new Rectangle();
		}
		
		System.out.println("Unknown shape name");
		return null;
	}

}
