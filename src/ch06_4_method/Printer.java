package ch06_4_method;

public class Printer {
	
	// �ʵ� ����
	int a;
	boolean b;
	double c;
	String d;
	
	// �޼ҵ� �����ε�
	int println(int a) {
		System.out.println(a);
		return a;
	}
	
	boolean println(boolean b) {
		System.out.println(b);
		return b;
	}
	
	double println(double c) {
		System.out.println(c);
		return c;
	}
	
	String println(String d) {
		System.out.println(d);
		return d;
	}
}
