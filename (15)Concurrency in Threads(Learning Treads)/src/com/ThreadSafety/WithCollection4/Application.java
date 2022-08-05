package com.ThreadSafety.WithCollection4;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		InventoryManager manager = new InventoryManager();
		
		// Using Anonymous class
		Thread inventoryTask = new Thread(new Runnable(){

			@Override
			public void run() {
				manager.populateSoldProducts();
			}
			
		});
		
		Thread displayTask = new Thread(new Runnable(){

			@Override
			public void run() {
				manager.displaySoldProducts();
			}
			
		});
		
		inventoryTask.start();
		Thread.sleep(2000); 
		//inventoryTask.join();	
		displayTask.start();

	}

}


/*
 * Collections are not thread safe
   o/p:  
	Added Productid=1| name=test_product_1
Added Productid=2| name=test_product_2
Printing the Soldid=1| name=test_product_1
Printing the Soldid=2| name=test_product_2
Added Productid=3| name=test_product_3
Added Productid=4| name=test_product_4
Exception in thread "Thread-1" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
	at java.util.ArrayList$Itr.next(ArrayList.java:859)
	at com.ThreadSafety.WithCollection.InventoryManager.displaySoldProducts(InventoryManager.java:25)
	at com.ThreadSafety.WithCollection.Application$2.run(Application.java:22)
	at java.lang.Thread.run(Thread.java:748)
Added Productid=5| name=test_product_5
Added Productid=6| name=test_product_6
Added Productid=7| name=test_product_7
Added Productid=8| name=test_product_8
Added Productid=9| name=test_product_9
 
 
 * inventoryTask.join(); - invokes next thread after completion of inventoryTask thread
 * To overcome this, we use vector & CopyOnWriteArrayList
	(1)Vector vec = new Vector();
	(2)List<Product> soldProductlist = new CopyOnWriteArrayList<>();
		import java.util.concurrent.CopyOnWriteArrayList; (package)

*/