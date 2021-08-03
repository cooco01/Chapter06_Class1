package ch06_5_instance_static;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("Porsche");
		Car yourCar = new Car("Benz");
		
		myCar.run();
		yourCar.run();
	}
}
