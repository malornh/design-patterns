package strategy;

public class StrategyMain {

	public static void main(String[] args) {

		ShoppingCart shoppingCart = new ShoppingCart();
		Item product1 = new Item("Banana", 2.5);
		Item product2 = new Item("Juice", 1.7);
		
		shoppingCart.addItem(product1);
		shoppingCart.addItem(product2);
		
		//shoppingCart.pay(new PaypalPayment("test@abv.bg", "123"));
		shoppingCart.pay(new CreditCardPayment("Ivan Ivanov", "1231 1231 1231 1231", "10/22", "111"));

	}

}
