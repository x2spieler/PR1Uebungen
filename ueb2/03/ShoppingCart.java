package com.mymart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<CartItem> cart = new ArrayList<>();

	public void add(CartItem item) {
		cart.add(item);
	}

	public double getTotalCost() {
		double ret = 0;
		for (CartItem cartItem : cart) {
			ret += cartItem.getCost();
		}
		return ret;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (CartItem cartItem : cart) {
			sb.append(cartItem.toString());
		}
		sb.append(String.format("\rSumme:%55.2f\r", getTotalCost()));
		return sb.toString();
	}
}
