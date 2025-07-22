package inheritance.single;

class InheritB extends InheritA{
	int ab=80;
	int b= 30;
	public void mul() {
		super.a=a;
		System.out.println("from B class");
		System.out.println(a);
		this.ab = ab;
	}

	public static void main(String[] args) {
		InheritB obj= new InheritB();
		obj.add();
		obj.mul();
	}
}