package corejava.multithreading;

public class GetAndSetThreadName extends Thread {

	public static void main(String[] args) {
		GetAndSetThreadName obj = new GetAndSetThreadName();
		obj.start();
		Thread currentThread = Thread.currentThread();
		System.out.println("Thread name is " + currentThread.getName());
	}

	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println("Thread name before rename :- " + currentThread.getName());
		currentThread.setName("RunThread");
		System.out.println("Thread name after rename :- " + currentThread.getName());
		
	}
}
