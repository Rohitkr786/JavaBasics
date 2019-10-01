package corejava.inhertance;

public class LaptopDriver {
	static TouchScreenLaptop obj = null;

	public static void main(String[] args) {
		obj = new HPNoteBook();
		obj.click();
		obj.scroll();
		obj = new DellNoteBook(); //polymorphism
		obj.click();
	}

}
