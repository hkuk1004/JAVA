package ch12;

public class AccountUser extends Thread{
	boolean flag; // default : false
	Account act;
	String name;
	public AccountUser(Account act, String name) {
		super(name); // Thread이름
		this.act = act;
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			int amt = (int)(Math.random()*10000 + 1);
			if(flag) act.deposit(amt, name);
			else act.withdraw(amt,name);
			flag = !flag; // true면 false, false면 true
			act.print();
		}
	}
}
