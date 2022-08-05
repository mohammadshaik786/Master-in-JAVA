package com.ThreadSafety.WithCollection4;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	
	List<Product> soldProductlist = new CopyOnWriteArrayList<>();
	List<Product> purchasedProductlist = new ArrayList<>();
	
	//Vector vec = new Vector();
	
	public void populateSoldProducts(){
		for(int i = 1; i < 100; i++){
			Product prod = new Product(i,"test_product_"+i);
			soldProductlist.add(prod);
			System.out.println("Added Product: " + prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void displaySoldProducts(){
		for(Product product : soldProductlist ){
			System.out.println("Printing the Sold: " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
