package visitor;

public class VisitorMain {

	public static void main(String[] args) {


		Product apple = new Fruit("Apple", 1.5, 3);
		Product banana = new Fruit("Banana", 2.5, 1);
		
		Product book = new Book(70, "The witcher", "SNNF343249A");
		
		ShoppingCartVisitor priceCalculator = new PriceCalculator();
		
		double priceForApples = apple.accept(priceCalculator);
		double priceForBananas = banana.accept(priceCalculator);
		double priceForBook = book.accept(priceCalculator);

	}

}
