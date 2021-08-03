package ch06_2_field;

class Circle{
	int rad;
	
	public Circle(int rad) { // 생성자
		this.rad = rad; // 이름 식별
	}
}


public class Car {
	
	// Field > Car 클래스 필드 선언
	String company = "";
	String model = "";
	String color = "";
	String engine = "";
	int maxSpeed = 350;
	int speed;
	
	Car(String company, String model, String color, String engine){
		this.company = company;
		this.model = model;
		this.color = color;
		this.engine = engine;
	}
	Car(String company, String model, String color){
		this.company = company;
		this.model = model;
		this.color = color;
	}
}
