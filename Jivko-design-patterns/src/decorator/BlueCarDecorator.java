package decorator;

public class BlueCarDecorator extends CarDecorator {

	public BlueCarDecorator(Car decoratedCar) {
		super(decoratedCar);
	}
	
	public void create() {
		decoratedCar.create();
		setBlueColor();
	}
	
	private void setBlueColor() {
		//.. decoratedCar
		System.out.println("Setting blue to car");
	}

}
