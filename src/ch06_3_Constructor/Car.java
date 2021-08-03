package ch06_3_Constructor;

public class Car {

	// Field
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	
	// 1번 생성자
	Car(){		
	}
	
	// 2번 생성자
	Car(String model){
		this.model = model;
	}
	
	// 3번 생성자
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	// 4번 생성자
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
