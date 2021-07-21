package Infrastructure;

import java.util.ArrayList;

import java.util.Date;

import javax.management.AttributeNotFoundException;


public class CyberStore {

//------------------------------ GLOBAL VARIABLES ---------------------------------------
			
	private ArrayList<ComputerZubeh�r> stock;
	private ArrayList<ComputerZubeh�r> shop;
	
	private double size;
	private String location;

//------------------------------ CONSTRUCTOR ---------------------------------------
				
	public CyberStore() {
		
		stock = new ArrayList<ComputerZubeh�r>();
		shop = new ArrayList<ComputerZubeh�r>();
		
		stock.add(new Mouse("Corsair Pro Max Ultra V.7", new Date(10000000), new Date(1001050), Hersteller.CORSAIR));
		stock.add(new Mouse("HP Mouse", new Date(10000000), new Date(1001050), Hersteller.HP));
		stock.add(new Keyboard("Thinkpad Keyboard", new Date(12), new Date(14), Hersteller.THINKPAD, "", false, true));
	}
	

//------------------------------ SELF-DEFINED METHODS ---------------------------------------
			
	//Clears the list Stock
	public void clearStock() {
		stock.clear();
	}
	//Clears the list Shop
	public void clearShop() {
		stock.clear();
	}
	
	/*
	 * Description: 
	 * Trys to add new ComputerZubeh�r into the Arraylist stock
	 */
	public void addStockComputerZubeh�r(ComputerZubeh�r newComputerZubeh�r) throws Throwable {
		if(!stock.contains(newComputerZubeh�r)&&!newComputerZubeh�r.getName().isEmpty()) {
			stock.add(newComputerZubeh�r);
		}else if(stock.contains(newComputerZubeh�r)){
			throw new IllegalArgumentException("Computerzubeh�r gibt es bereits!");
		}
	}

	/*
	 * Description: 
	 * Trys to remove new ComputerZubeh�r from the Arraylist stock
	 */
	
	public void deleteStockComputerZubeh�r(ComputerZubeh�r newComputerZubeh�r) throws Exception {
		if(stock.contains(newComputerZubeh�r)) {
			stock.remove(newComputerZubeh�r);
		}else {
			throw new AttributeNotFoundException("Das zu l�schende Objekt existiert nicht");
		}
	}
	
	/*
	 * Description :
	 * Trys to Add a new ComputerZubeh�r into the Shop
	 */
	
	public void addComputerZubeh�rToShop(ComputerZubeh�r newComputerzubeh�r) {
		if(shop.contains(newComputerzubeh�r))
		{
			return;
		}
		else {
			shop.add(newComputerzubeh�r);
		}
	}
	

//------------------------------ GET / SET METHODS ---------------------------------------
			
	
	public ArrayList<ComputerZubeh�r> getStock() {
		return stock;
	}


	public void setStock(ArrayList<ComputerZubeh�r> stock) {
		this.stock = stock;
	}


	public ArrayList<ComputerZubeh�r> getShop() {
		return shop;
	}


	public void setShop(ArrayList<ComputerZubeh�r> shop) {
		this.shop = shop;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
	
}
