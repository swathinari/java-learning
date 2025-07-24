package creational;

public class SingletonDP {
	/*
	 * *Singleton is a design pattern, which guarantee of only one object creation
	 * real time example: Logging and spring bean
	 */
	private static SingletonDP singleObj;
	public static SingletonDP getInstance() {
		if(singleObj==null) {
			System.out.println(" single static instace is used");
			singleObj=new SingletonDP();
		}else {
			singleObj=new SingletonDP();
			System.out.println("new instace being created");
		}
		return singleObj;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonDP.getInstance();
	}

}
