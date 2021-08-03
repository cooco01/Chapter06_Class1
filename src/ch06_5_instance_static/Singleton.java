package ch06_5_instance_static;

public class Singleton {
	
	// ����ƽ �ʵ�(1�� ��ü ������ �������� ����)
	private static Singleton singleton = new Singleton();
	
	// private ������ >> �ܺο��� ������ ȣ�� �ȵǵ����ϱ�
	private Singleton() {}
	
	// ����ƽ �޼ҵ�
	static Singleton getInstance() {
		return singleton;
	}
}
