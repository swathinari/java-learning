package inheritance.multiple;

public class Parent implements SuperInheritance {

	int a=10;
	int b=20;
	
	public int add() {
		int c= a+b;
		return c;
	}

	public int div() {
		int c= a/b;
		return c;
	}
	
	public int power() {
		int c=a*a;
		return c;
	}

}
