package inheritance.multiple;

public class Child extends Parent {
	int a=10;
	int b=5;
	public int mod() {
		int c= a%b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		System.out.println(c.power());
		System.out.println(c.div());
		System.out.println(c.add());
		System.out.println(c.mod());

	}

}
