package multithreading;

public class MultiThreadingRunnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MultiThreadingThingRunnable myThread = new MultiThreadingThingRunnable(); // object for class
		
		//myThread.add();
		//myThread.power(); //---> invoking the methods from imple class
		Thread  t= new Thread(myThread);  // passing the object in thread object
		t.start();
		t.run();
		System.out.println("yeild method");
		Thread.yield();
	System.out.println(	Thread.holdsLock(myThread));
		System.out.println(Thread.currentThread());
		System.out.println(Thread.activeCount());
		System.out.println(t.isAlive());
		t.join(5000);
		System.out.println(t.isAlive());
	

	}

}
