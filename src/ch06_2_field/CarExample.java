package ch06_2_field;

public class CarExample {
	public static void main(String[] args) {
		
		// �ܺ�Ŭ�������� Car �ʵ尪 �б�� ����
		
		// ��ü ���� (�ν��Ͻ� ȭ)
		Car myCar = new Car("�����", "ī�Ϲ�", "���"); // �Ű������� ������ ��ġ�ؾ��� > ���� ����
		Car secondCar = new Car("������", "�ƹݶ�", "�׷���","����"); // ���ο� ��ü ����
		
		// �ʵ尪 �б�
		System.out.println("����ȸ�� : " + secondCar.company);
		System.out.println("�𵨸� : " + secondCar.model);
		System.out.println("���� : " + secondCar.color);
		System.out.println("���� : " + secondCar.engine);
		System.out.println("�ְ�ӵ� : " + secondCar.maxSpeed);
		System.out.println("����ӵ� : " + secondCar.speed);
		
		// �ʵ尪 ����	
		myCar.speed = 60;
		System.out.println("������ �ӵ� : " + secondCar.speed);
		
		
	}
}
