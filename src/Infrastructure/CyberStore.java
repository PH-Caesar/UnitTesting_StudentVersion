package Infrastructure;

import java.util.ArrayList;

import java.util.Date;

import javax.management.AttributeNotFoundException;


public class CyberStore {

//------------------------------ GLOBAL VARIABLES ---------------------------------------
			
	private ArrayList<ComputerZubehör> stock;
	private ArrayList<ComputerZubehör> shop;
	
	private double size;
	private String location;

//------------------------------ CONSTRUCTOR ---------------------------------------
				
	public CyberStore() {
		
		stock = new ArrayList<ComputerZubehör>();
		shop = new ArrayList<ComputerZubehör>();
		
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
	 * Trys to add new ComputerZubehör into the Arraylist stock
	 */
	public void addStockComputerZubehör(ComputerZubehör newComputerZubehör) throws Throwable {
		if(!stock.contains(newComputerZubehör)&&!newComputerZubehör.getName().isEmpty()) {
			stock.add(newComputerZubehör);
		}else if(stock.contains(newComputerZubehör)){
			throw new IllegalArgumentException("Computerzubehör gibt es bereits!");
		}
	}

	/*
	 * Description: 
	 * Trys to remove new ComputerZubehör from the Arraylist stock
	 */
	
	public void deleteStockComputerZubehör(ComputerZubehör newComputerZubehör) throws Exception {
		if(stock.contains(newComputerZubehör)) {
			stock.remove(newComputerZubehör);
		}else {
			throw new AttributeNotFoundException("Das zu löschende Objekt existiert nicht");
		}
	}
	
	/*
	 * Description :
	 * Trys to Add a new ComputerZubehör into the Shop
	 */
	
	public void addComputerZubehörToShop(ComputerZubehör newComputerzubehör) {
		if(shop.contains(newComputerzubehör))
		{
			return;
		}
		else {
			shop.add(newComputerzubehör);
		}
	}
	

//------------------------------ GET / SET METHODS ---------------------------------------
			
	
	public ArrayList<ComputerZubehör> getStock() {
		return stock;
	}


	public void setStock(ArrayList<ComputerZubehör> stock) {
		this.stock = stock;
	}


	public ArrayList<ComputerZubehör> getShop() {
		return shop;
	}


	public void setShop(ArrayList<ComputerZubehör> shop) {
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
