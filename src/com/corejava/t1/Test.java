package com.corejava.t1;

public class Test {

	public static void main(String[] args) {
		String name="Krish Welcome to the Java 6 Version Java is a Beautiful Programming Language";
    	String data[]=name.split(" ");
    	for(int i=0;i<data.length;i++)
                	if(data[i].length()==4)
                            	System.out.println(data[i].trim().toUpperCase());
    	

	}

}
