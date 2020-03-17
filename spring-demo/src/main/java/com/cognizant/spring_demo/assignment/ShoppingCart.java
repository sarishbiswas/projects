package com.cognizant.spring_demo.assignment;

public class ShoppingCart {
	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [item= " + item.getId()+" "+item.getName()+" "+item.getPrice()+" "+item.getQuantity()+ "]";
	}
	
	
}
