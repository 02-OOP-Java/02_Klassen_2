package com.cc.java;

public class Yard {

	public static void main(String[] args) {
		
		// Cat --> Klasse
		// cat --> Instanz / Objekt 		
		

		// erste Instanz (Objekt)
		Cat cat1 = new Cat();
		cat1.name = "Grizabella";
		cat1.tellYourName();
		cat1.tellYourAddress();
		
		System.out.println("----------------");
		
		// zweite Instanz (Objekt)
		Cat cat2 = new Cat();
		cat2.name = "Alonzo";
		cat2.tellYourName();
		cat2.tellYourAddress();
	

	}

}
