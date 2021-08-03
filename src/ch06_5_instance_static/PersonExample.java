package ch06_5_instance_static;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "È«±æµ¿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa" > ¿À·ù
		// p1.ssn = "654321-7654321" > ¿À·ù
		p1.name = "È«»ï¿ø";
	}
	
}
