package ch06_5_instance_static;

public class Singleton {
	
	// 스태틱 필드(1개 객체 생성된 참조변수 생성)
	private static Singleton singleton = new Singleton();
	
	// private 생성자 >> 외부에서 생성자 호출 안되도록하기
	private Singleton() {}
	
	// 스택틱 메소드
	static Singleton getInstance() {
		return singleton;
	}
}
