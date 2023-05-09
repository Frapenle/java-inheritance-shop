package org.shop.java;

public class Shop {
	public static void main(String[] args) {
		Prodotto p = new Prodotto(12345, "nome prodotto", "marca", 1000, 22);
		Smartphone s = new Smartphone(12345, "Iphone", "Apple", 1000, 22, "1234567890", 256);
		Televisore t = new Televisore(12345, "Iphone", "Apple", 1000, 22, 100, true);
		Cuffia c = new Cuffia(12345, "Iphone", "Apple", 1000, 22, "red", false);
		
		System.out.println(p);
		System.out.println(s);
		System.out.println(t);
		System.out.println(c);
	}
}
