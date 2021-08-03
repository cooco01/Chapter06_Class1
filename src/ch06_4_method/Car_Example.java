package ch06_4_method;

public class Car_Example {
	public static void main(String[] args) {
		Car_ myCar = new Car_();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도: " + speed + "km/h");
	}
}
