package ch06_5_instance_static;

public class Car_ {
	
	// �ʵ� ����
	int speed;
	
	// ������ ����
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}

	// �޼ҵ� ����
	public static void main(String[] args) {
		Car_ myCar = new Car_();
		myCar.speed = 60;
		myCar.run();
	}

}
