package com.ncet.cj;

public class Bag {
	
	private double capacity = 20;
	private Product products[]=new Product[100];
	private int count = 0;
	
	public void addProduct(Product product) {
		if(hasCapacity(product)) {
			products[count++]= product;
		}else {
			System.out.println("Alredy you are overloaded him!....");
		}
	}
	public boolean hasCapacity(Product product) {
		int sum = 0;
		for(int i=0;i<count;i++) {
			sum += products[i].getWeight();
		}
		
		return capacity >= sum + product.getWeight() ;
		
	}
	public void showInfo() {
		for(int i=0;i<count;i++) {
			System.out.println(products[i].weight);
		}
	}
}
