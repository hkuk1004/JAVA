package ch03;

public class Continue1 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("반복한다");
			if(i>3) continue; // 아래문장을 수행하지않고 증감으로 간다
			System.out.println("나두" +i);
		}
	}
}
