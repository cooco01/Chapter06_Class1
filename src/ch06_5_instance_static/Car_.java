package ch06_5_instance_static;

public class Car_ {
	
	// 필드 생성
	int speed;
	
	// 생성자 생성
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	// 메소드 생성
	public static void main(String[] args) {
		Car_ myCar = new Car_();
		myCar.speed = 60;
		myCar.run();
	}

}
