package com.ncet.cj;

public class Manager {
	public static void main(String[] args) {

		Product p1 = new Dog();
		p1.setWeight(5);

		Product p2 = new Dog();
		p2.setWeight(7);

		Product p3 = new Panda();
		p3.setWeight(6);
		
		Product p4 = new Panda();
		p4.setWeight(6);

		Bag bag = new Bag();
		
		bag.addProduct(p1);
		bag.addProduct(p2);
		bag.addProduct(p3);
		bag.addProduct(p4);

		bag.showInfo();

	}
}
