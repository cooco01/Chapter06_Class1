package ch06_4_method;

public class MemberService {
	
	// �ʵ�
	String id;
	String password;
	
	// �޼ҵ�
	
	
	boolean login(String id, String password){
		if(id=="hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("�α׾ƿ��� �Ǿ����ϴ�");
		return;
	}
	
}
