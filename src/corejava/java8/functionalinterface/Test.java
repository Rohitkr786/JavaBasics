package corejava.java8.functionalinterface;

public class Test {

	public static void main(String[] args) {
		int res = 0;
		FunctionalInterfaceDemo fi = (x,y) -> x+y;
		fi.add(10, 20);
	}

}
