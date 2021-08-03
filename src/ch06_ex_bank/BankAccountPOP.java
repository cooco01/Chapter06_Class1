package ch06_ex_bank;

// 은행 계좌 기능 구현 클래스



public class BankAccountPOP {
	
	
	// static > Instance Field / new 생성하지 않고 바로 메모리에 생성
	
	
		
	
	// 계좌 초기화
	static int balance = 0;
	
	public static void main(String[] args) {
		
		// 계좌 입금
		deposit(10000); 
		
		// 계좌 출금 > 계좌 출금하기
		withdraw(3000);
	
		// 계좌 잔고 출력 
		checkBalance();
		
		withdraw(1000);
		
		deposit(30000);
		}
	

	private static void checkBalance() {
		System.out.println("잔고: " + balance);
	}

	private static void withdraw(int withdrawAmount) {
		balance = balance - withdrawAmount;
		
	}

	private static void deposit(int depositAmount) {
		balance = balance + depositAmount;
	}
}
