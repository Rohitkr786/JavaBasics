package corejava.practice;

public class Scooter extends Bike {
	public static void main(String[] args) {
		Scooter sc= new Scooter();
		sc.fuel();
		
	}
	@Override
	public void fuel() {
		System.out.println("petrol");
		super.fuel();
	}
}
