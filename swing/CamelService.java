package com.jse.swing;

public class CamelService {
	private CamelBean[] camels;
	public CamelService() {
		camels = new CamelBean[10];
	}
	public void setCamelBean(CamelBean[] camels) {
		this.camels = camels;
	}
	public CamelBean[] getCamelBean() {
		return camels;
	}
}
