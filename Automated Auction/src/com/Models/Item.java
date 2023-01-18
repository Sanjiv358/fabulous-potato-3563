package com.Models;

public class Item {
	
	private int itemId;
	private String item_Name;
	private int price;
	private int quantity;
	private String category;
	private int sellerId;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String item_Name, int price, int quantity, String category, int sellerId) {
		super();
		this.itemId = itemId;
		this.item_Name = item_Name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.sellerId = sellerId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItem_Name() {
		return item_Name;
	}

	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", item_Name=" + item_Name + ", price=" + price + ", quantity=" + quantity
				+ ", category=" + category + ", sellerId=" + sellerId + "]";
	}
	
	

}
