package com.jse.app;

public class Tv {
	private String color;
	private boolean power;
	private int channel;
	
	public void power() {
		power = !power;
	}
	public void channelUp() {
		++channel;
	}
	public void chnnelDown() {
		--channel;
	}
	
}

