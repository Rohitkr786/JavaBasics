package corejava.multithreading;

public class MultiThreadingByExtends extends Thread {

	public static void main(String[] args) {
		MultiThreadingByExtends mt = new MultiThreadingByExtends();
		mt.start();
		for (int i = 0; i < 50; i++) {
			System.out.println("Main Method");
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Run method");
			/*
			 * try { Thread.sleep(100); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
		}
	}

}
