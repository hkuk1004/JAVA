package ch12;

public class Account {
	private int total;
	public Account(int total) {
		this.total = total; // 초기화할 때 사용
	}
	// synchronized : 동시에 메서드를 사용하는 것을 방지
	synchronized void deposit(int amt, String name) {
		total += amt;
		System.out.println(name+"님이 입금 : "+amt);
	}
	synchronized void withdraw(int amt, String name) {
		if(amt <= total) {
			total -= amt;
			System.out.println(name+"님이 출금 : "+amt);
   		}
		else {
			System.out.println("잔액이 부족합니다");
		}
	}
	void print() {
		System.out.println("잔액 : " + total);
	}
}
