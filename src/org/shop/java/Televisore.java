package org.shop.java;

public class Televisore extends Prodotto{
	private int dimension;
	private boolean isSmart;
	
	public Televisore(int code, String name, String brand, float price, float vat, int dimension, boolean isSmart) {
		super(code, name, brand, price, vat);
		this.dimension = dimension;
		this.isSmart = isSmart;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getProductString()
				+ "\n Dimensioni: " + getDimension()
				+ "\n Smart: " + (isSmart ? "Si" : "No")
				+ "\n ------------------ \n";
	}

}
