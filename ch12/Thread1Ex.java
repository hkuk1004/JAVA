package ch12;
class Thread1 extends Thread {
	public void run() {
		for(int i =0; i <100;i++) {
			System.out.print("쓰레드"+i+"\t");
			if (i%10 == 9) System.out.println();
			try { Thread.sleep(200); // 0,5 쉬어라
			}catch(InterruptedException e) {
			
			}
		}
	}
}
public class Thread1Ex {
	public static void main(String[] args) { 
		Thread1 th1 = new Thread1();
		th1.run();
		for(int i =0; i <100;i++) {
			System.out.print("메인"+i+"\t");
			if (i%10 == 9) System.out.println();
		}
	}
}