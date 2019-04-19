package corejava.multithreading;

public class ThreadingUsingRunnable implements Runnable {

	@Override
	public void run() {
		int i=0;
		for(;;) {
			System.out.println("In run method");
			i++;
			if(i==50)
				break;
		}
	}

	public static void main(String[] args) {
		ThreadingUsingRunnable obj = new ThreadingUsingRunnable();
		Thread thread = new Thread(obj);
		thread.start();
		int i=0;
		for(;;) {
			System.out.println("In Main Method ");
			i++;
			if(i==50)
				break;
		}
	}

}
