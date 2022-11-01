package com.Arraylist;

public class Items {
	
	private int Price;
	private String ProductName;
	private int Quantity;
	public int getPrice() {
		return Price;
	}
	public Items(int id, String ProductName, int Quantity) {
		super();
		this.Price= Price;
		this.ProductName= ProductName;
		this.Quantity=Quantity;
		
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
	

}



