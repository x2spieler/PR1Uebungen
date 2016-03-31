package com.mymart;

public class CartItem {
	private String name;
	private int quantity;
	private double pricePerUnit;

	public static void main(String[] args) {
		CartItem c1 = new CartItem("test", 2, 1.7d);
		CartItem c2 = new CartItem("test2", 5, 21.57d);
		CartItem c3 = new CartItem("test3", 1, 1251d);
		ShoppingCart sc = new ShoppingCart();
		sc.add(c1);
		sc.add(c2);
		sc.add(c3);
		System.out.println(sc);
	}

	public CartItem(String name, int quantity, double pricePerUnit) {
		super();
		if (pricePerUnit < 0.0d || name == null || name.isEmpty())
			throw new IllegalArgumentException();
		this.name = name;
		setQuantity(quantity);
		this.pricePerUnit = pricePerUnit;
	}

	public double getCost() {
		return pricePerUnit * quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity <= 0)
			throw new IllegalArgumentException();
		else
			this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%3d x %-30s   %10.2f  %10.2f\r", quantity, name, pricePerUnit, getCost());
	}
}
