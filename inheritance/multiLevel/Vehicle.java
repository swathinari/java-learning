package inheritance.multiLevel;

public class Vehicle {
	public void horn() {
		System.out.println("make some noice from vehicle...");
	}
	public void breaks() {
		System.out.println("please use breaks from vehicle ");
	}

}
class Bus extends Vehicle{
	public void tires() {
		System.out.println("tires from bus");
	}
	public void mirrors() {
		System.out.println("mirrors from bus");
	}
}
class Car extends Vehicle {
	public void carModel() {
		System.out.println("Hyndai");
	}
	public static void main(String[] args) {
		Car carObj= new Car();
		carObj.breaks();
		carObj.carModel();
		carObj.horn();
		
	}
}
