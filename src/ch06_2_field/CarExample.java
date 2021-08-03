package ch06_2_field;

public class CarExample {
	public static void main(String[] args) {
		
		// 외부클래스에서 Car 필드값 읽기와 변경
		
		// 객체 생성 (인스턴스 화)
		Car myCar = new Car("기아차", "카니발", "흰색"); // 매개변수의 개수가 일치해야함 > 값을 나열
		Car secondCar = new Car("현대차", "아반떼", "그레이","디젤"); // 새로운 객체 생성
		
		// 필드값 읽기
		System.out.println("제작회사 : " + secondCar.company);
		System.out.println("모델명 : " + secondCar.model);
		System.out.println("색깔 : " + secondCar.color);
		System.out.println("엔진 : " + secondCar.engine);
		System.out.println("최고속도 : " + secondCar.maxSpeed);
		System.out.println("현재속도 : " + secondCar.speed);
		
		// 필드값 변경	
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + secondCar.speed);
		
		
	}
}
