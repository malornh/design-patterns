package abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String colorName) {

		if(colorName == "RED") {
			return new Red();
		}
		
		if(colorName == "BLUE") {
			return new Blue();
		}
		
		if(colorName == "GREEN") {
			return new Green();
		}
		
		System.out.println("Unknown color name");
		return null;
	}

	@Override
	Shape getShape(String shapeName) {
		// Color factory cannot return shape instance
		return null;
	}

}
