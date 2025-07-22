package multithreading;

public class  MultiThreadingThingRunnable implements Runnable {

	@Override
	public  void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("T1 :"+i);
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}
	}
	{System.out.println();}
	public  void add() {
		//System.out.println("trying customd method with synchronized method class");
		for(int i=0;i<=10;i++) {
			System.out.println(" T2: "+i);
		}
	}
	public int power() {
		int res = 0;
		for(int i=0;i<=5;i++) {
			res= i*i;
			System.out.println("T3:");
		}
		
		return res;
	}
	
	{System.out.println();}

	public int adding() {
		int res = 2;
		for(int i=0;i<=5;i++) {
			res= i+i;
			System.out.println("T4:");
		}
		
		return res;
	}
	

}
