package org.shop.catalogo.java;

import java.util.Random;
import java.util.Scanner;
import org.shop.java.Cuffia;
import org.shop.java.Prodotto;
import org.shop.java.Smartphone;
import org.shop.java.Televisore;

public class Catalogo {

	public static void main(String[] args) {
		Random rnd = new Random();
		Prodotto[] prodotti = new Prodotto[100];
		Scanner sc = new Scanner(System.in);
		
		int code = rnd.nextInt(9999);
		int option = 0;
		int counter = 0;
		while (option != 4) {
			System.out.println("Cosa desideri inserire?"
					+ "\n 1) Smartphone"
					+ "\n 2) Televisore"
					+ "\n 3) Cuffia"
					+ "\n 4) Esci");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
				case 1:
				{
					System.out.println("Inserisci in nome dello smartphone: ");
					String name = sc.nextLine();
					
					System.out.println("Inserisci la marca dello smartphone: ");
					String brand = sc.nextLine();
					
					System.out.println("Inserisci il prezzo dello smartphone: ");
					float price = sc.nextFloat();
					
					System.out.println("Inserisci IMEI: ");
					String IMEI = sc.nextLine();
					sc.nextLine();
					
					System.out.println("Inserisci la quantita di memoria: ");
					int storage = sc.nextInt();
					prodotti[counter] = new Smartphone(code, name, brand, price, 22, IMEI, storage);
					System.out.println("----------------------");
					break;
				}
				case 2:
				{
					System.out.println("Inserisci in nome della TV: ");
					String name = sc.nextLine();
					
					System.out.println("Inserisci la marca della TV: ");
					String brand = sc.nextLine();
					
					System.out.println("Inserisci il prezzo della TV: ");
					float price = sc.nextFloat();
					sc.nextLine();
					
					System.out.println("Inserisci la dimensione in pollici: ");
					int dimension = sc.nextInt();
					sc.nextLine();
					
					System.out.println("E' una smart TV? ");
					String isSmartInput = sc.nextLine().toLowerCase();
					boolean isSmart;
					if (isSmartInput.equals("si")) {
					    isSmart = true;
					} else if (isSmartInput.equals("no")) {
					    isSmart = false;
					} else {
					    System.out.println("Errore. Inserire 'Si' o 'No'.");
					    return;
					}
					prodotti[counter] = new Televisore(code, name, brand, price, 22, dimension, isSmart);
					System.out.println("----------------------");
					break;
				}
				case 3:
				{
					System.out.println("Inserisci in nome delle cuffie: ");
					String name = sc.nextLine();
					
					System.out.println("Inserisci la marca della cuffia: ");
					String brand = sc.nextLine();
					
					System.out.println("Inserisci il prezzo della cuffia: ");
					float price = sc.nextFloat();
					sc.nextLine();
					
					System.out.println("Inserisci il colore: ");
					String color = sc.nextLine();
					
					System.out.println("Sono wirless? ");
					String isWirelessInput = sc.nextLine().toLowerCase();
					boolean isWireless;
					if (isWirelessInput.equals("si")) {
						isWireless = true;
					} else if (isWirelessInput.equals("no")) {
						isWireless = false;
					} else {
					    System.out.println("Errore. Inserire 'Si' o 'No'.");
					    return;
					}
					prodotti[counter] = new Cuffia(code, name, brand, price, 22, color, isWireless);
					System.out.println("----------------------");
					break;
					}
				case 4:
					break;
				default:
                	System.out.println(option + " non è un opzione valida");
                	System.out.println("----------------------");
				}
			counter++;
		}
		for (Prodotto prodotto : prodotti) {
		    if (prodotto instanceof Smartphone) {
		        System.out.println("Smartphone: \n" + prodotto);
		        System.out.println("----------------------");
		    }
		    if (prodotto instanceof Televisore) {
		        System.out.println("Televisore: \n" + prodotto);
		        System.out.println("----------------------");
		    }
		    if (prodotto instanceof Cuffia) {
		        System.out.println("Cuffia: \n" + prodotto);
		        System.out.println("----------------------");
		    }
		}
		
		sc.close();
		}
	}