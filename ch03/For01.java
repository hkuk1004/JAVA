package ch03;

public class For01 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(int i = 10; i > 0; i--) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(int i = 1; i <= 10; i += 2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		int i = 1;
		for(;i<=10;i++) { // ;는 반드시 있어야 되지만 사이 식이나 값은 제거할 수 있다.
			System.out.print(i+"\t");
		}
		for (; ; ) {
			System.out.print(i+"\t");
			if (i>10)break;
			i++;
		}
	}

}
