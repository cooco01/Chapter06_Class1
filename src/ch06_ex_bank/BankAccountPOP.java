package ch06_ex_bank;

// ���� ���� ��� ���� Ŭ����



public class BankAccountPOP {
	
	
	// static > Instance Field / new �������� �ʰ� �ٷ� �޸𸮿� ����
	
	
		
	
	// ���� �ʱ�ȭ
	static int balance = 0;
	
	public static void main(String[] args) {
		
		// ���� �Ա�
		deposit(10000); 
		
		// ���� ��� > ���� ����ϱ�
		withdraw(3000);
	
		// ���� �ܰ� ��� 
		checkBalance();
		
		withdraw(1000);
		
		deposit(30000);
		}
	

	private static void checkBalance() {
		System.out.println("�ܰ�: " + balance);
	}

	private static void withdraw(int withdrawAmount) {
		balance = balance - withdrawAmount;
		
	}

	private static void deposit(int depositAmount) {
		balance = balance + depositAmount;
	}
}
