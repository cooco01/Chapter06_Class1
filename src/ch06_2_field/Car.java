package ch06_2_field;

class Circle{
	int rad;
	
	public Circle(int rad) { // ������
		this.rad = rad; // �̸� �ĺ�
	}
}


public class Car {
	
	// Field > Car Ŭ���� �ʵ� ����
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
