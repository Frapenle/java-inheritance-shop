package org.shop.java;

public class Prodotto {
//	variables
	private int code;
	private String name;
	private String brand;
	private float price;
	private float vat;
		
//	constructor
	public Prodotto(int code, String name, String brand, float price, float vat) {
		super();
		this.code = code;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.vat = vat;
	}
//	methods getter setter
//	name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	brand
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

//	price
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

//	vat
	public float getVat() {
		return vat;
	}

	public void setVat(float vat) {
		this.vat = vat;
	}

//	code read only
	public int getCode() {
		return code;
	}
	
//	price + vat
	public float getPriceWithVat() {
		return price + (price * vat / 100);
	}
	
//	
	public String getProductString() {
			
			return "Nome prodotto: " + getName()
			+ "\n Marca: " + getBrand()
			+ "\n Prezzo " + String.format("%.2f", getPrice()) + " €"
			+ "\n Prezzo con iva " + String.format("%.2f", getPriceWithVat()) + " €";
			
		}
	
	@Override
		public String toString() { 
			return "Prodotto: " + getProductString()
			+ "\n ------------------ \n";
		}
}
	
	
	

