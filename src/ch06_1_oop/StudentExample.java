package ch06_1_oop;

public class StudentExample {
	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		System.out.println(s1.num); // 생성자 student 파일에 num = 100을 써놔서 출력
		
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		s1.setNum(1);
		
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
		s2.setNum(2);
		
		System.out.println(s1.getNum());
		System.out.println(s2.getNum());		
		
	}
}
