package ch12;
class DaeMon1 extends Thread{
	public void run() {
		while(true) {
			System.out.println("데몬");
			try { Thread.sleep(300); }
			catch(InterruptedException e) { }
		}
	}
}
public class DaeMon1Ex {
	public static void main(String[] args) {
		DaeMon1 dm = new DaeMon1();
		// 메인 작업이 끝나면 모든 쓰레드도 종료하라, start( ) 메서드 앞에 있어야 한다
		dm.setDaemon(true);
		dm.start();
		for(int i=1; i<20; i++) {
			System.out.println(i);
			try {Thread.sleep(300); } 
			catch(InterruptedException e) { }
		}
	}
}