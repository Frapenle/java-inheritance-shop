package org.shop.java;

import java.util.Random;

public class Smartphone extends Prodotto{
//	variabili da aggiungere oltre a quelle della classe prodotto
	private final String IMEI;
	private int storage;

//	constructor
	public Smartphone(int code, String name, String brand, float price, float vat, String IMEI, int storage) {
		super(code, name, brand, price, vat);
		this.IMEI = IMEI;
		this.storage = storage;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String getIMEI() {
		return IMEI;
	}
	
	@Override
	public String toString() {
		return getProductString()
				+ "\n IMEI: " + getIMEI()
				+ "\n Memoria: " + getStorage() + " gb"
				+ "\n ------------------ \n";
	}
}
