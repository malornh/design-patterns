package visitor;

public class Book implements Product {

	private double price;
	private String title;
	private String isbnNumber;
	
	public Book(double price, String title, String isbnNumber) {
		this.price = price;
		this.title = title;
		this.isbnNumber = isbnNumber;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

}
