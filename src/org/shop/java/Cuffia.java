package org.shop.java;

public class Cuffia extends Prodotto{
	private String color;
	private boolean isWireless;
	public Cuffia(int code, String name, String brand, float price, float vat, String color, boolean isWireless) {
		super(code, name, brand, price, vat);
		this.color = color;
		this.isWireless = isWireless;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isWireless() {
		return isWireless;
	}
	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	@Override
	public String toString() {
		return getProductString()
				+ "\n Colore: " + getColor()
				+ "\n Wirless: " + (isWireless ? "Si" : "No, cablate")
				+ "\n ------------------ \n";
	}
}
