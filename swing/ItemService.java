package com.jse.swing;

public class ItemService {
	private ItemBean[] items;

	public ItemBean[] getItems() {
		return items;
	}

	public void setItems(ItemBean[] items) {
		this.items = items;
	}
	public ItemService() {
		items = new ItemBean[10];
	}
	
}
