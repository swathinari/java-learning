package multithreading;

public class MultiThreadingMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MultiThreadingThing myThread= new MultiThreadingThing();
		MultiThreadingThing myThread1= new MultiThreadingThing();
		myThread.start();
		myThread.add();
		myThread.power();
		myThread.adding();
		
		System.out.println();
		myThread1.start();
		myThread1.add();
		myThread1.power();
		myThread1.adding();
		
		myThread.join();
		myThread1.join();

	}

}
