package com.jse.swing;

public class ProductService {
	private ProductBean[] products;
	public ProductService() {
		products = new ProductBean[10];
	}
	public ProductBean[] getProducts() {
		return products;
	}
	public void setProducts(ProductBean[] products) {
		this.products = products;
	}
}
