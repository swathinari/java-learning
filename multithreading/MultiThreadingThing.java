package multithreading;

public class MultiThreadingThing extends Thread {

	@Override
	public synchronized void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("synchronized for run method :"+i);
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}
	}
	{System.out.println();}
	public synchronized void add() {
		//System.out.println("trying customd method with synchronized method class");
		for(int i=0;i<=10;i++) {
			System.out.println("synchronized for custom :"+i);
		}
	}
	public int power() {
		int res = 0;
		for(int i=0;i<=5;i++) {
			res= i*i;
			System.out.println("knowing wt is "+res+ " holding");
		}
		
		return res;
	}
	
	{System.out.println();}

	public int adding() {
		int res = 2;
		for(int i=0;i<=5;i++) {
			res= i+i;
			System.out.println("some addition "+res+ " holding");
		}
		
		return res;
	}
	

}
