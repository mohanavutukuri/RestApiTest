package com.RestPackages.models;



public class BreweryProduct {

	private int productId;
	private String productName;
	private int price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public BreweryProduct(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	
	public BreweryProduct(int productId, String productName, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public BreweryProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BreweryProduct [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
