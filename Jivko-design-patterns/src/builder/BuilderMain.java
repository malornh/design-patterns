package builder;

public class BuilderMain {

	public static void main(String[] args) {

		Cake cocoaCake = new Cake.Builder().cocoa(10).sugar(1.5).eggs(4).build();
		Cake vanillaCake = new Cake.Builder().vanilla(3).eggs(3).sugar(4).build();

	}

}
