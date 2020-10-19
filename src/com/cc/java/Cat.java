package com.cc.java;

public class Cat 
{

	// Property / Attribut / Field
	public String name = "noname";
	
	public void tellYourName() {
		System.out.println(this.name);
	}

	// this --> Instanzvariable
	public void tellYourAddress()
	{
		System.out.println("instance address: " + this);
	}
	
}
