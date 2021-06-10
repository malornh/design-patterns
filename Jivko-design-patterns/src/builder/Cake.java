package builder;

public class Cake {

	private final double sugar;
	private final double butter;
	private final int eggs;
	private final int cocoa;
	private final int vanilla;
	
	public static class Builder {
		
		private double sugar;
		private double butter;
		private int eggs;
		private int cocoa;
		private int vanilla;
		
		public Builder sugar(double cups) {
			this.sugar = cups;
			return this;
		}
		
		public Builder butter(double cups) {
			this.butter = cups;
			return this;
		}
		
		public Builder eggs(int count) {
			this.eggs = count;
			return this;
		}
		
		public Builder cocoa(int spoons) {
			this.cocoa = spoons;
			return this;
		}
		
		public Builder vanilla(int packages) {
			this.vanilla = packages;
			return this;
		}
		
		public Cake build() {
			return new Cake(this);
		}
		
	}
	
	private Cake(Builder builder) {
		this.sugar = builder.sugar;
		this.butter = builder.butter;
		this.eggs = builder.eggs;
		this.cocoa = builder.cocoa;
		this.vanilla = builder.vanilla;
	}
}

