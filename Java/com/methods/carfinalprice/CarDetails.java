package com.methods.carfinalprice;

public class CarDetails {

	String name,color,brand;
	double price,total;
	int discount;
	
	public void finalPrice() {
		total= ((100-discount)*price)/100;
	}
	
	public void display() {
		System.out.println(" _____________________"+"\n| Car name : "+ name+ "\n| Color    : "+color+
				"\n| Brand    : "+brand+"\n|_____________________"+"\n| Price    : "+price+
				"\n| Discount : "+discount+"%"+"\n|_____________________"+"\n| Total    : "+total);
	}
}
