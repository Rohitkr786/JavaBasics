package corejava.multithreading;

public class PriorityThreading extends Thread {

	public static void main(String[] args) {
		// Normal priority is = 5
		PriorityThreading obj1 = new PriorityThreading();
		obj1.setPriority(MAX_PRIORITY); // Max_Priority value = 10 of int datatype
		obj1.setName("Thread one");
		obj1.start();
		PriorityThreading obj2 = new PriorityThreading();
		obj2.setPriority(MIN_PRIORITY); // Min_Priority value = 1 of int datatype
		obj2.setName("Thread two");
		obj2.start();
		/*
		 * Which ever thread having highest priority will be executed first
		 * use can set own priority from 1 to 10 in setPriority(yourValue); method
		 */
		/**
		 * The minimum priority that a thread can have.
		 */
		/* public static final int MIN_PRIORITY = 1; */

		/**
		 * The default priority that is assigned to a thread.
		 */
		/* public static final int NORM_PRIORITY = 5; */

		/**
		 * The maximum priority that a thread can have.
		 */
		/* public static final int MAX_PRIORITY = 10; */
	}

	public void run() {
		System.out.println("Thread name is :- " + Thread.currentThread().getName());
	}
}
