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
		for(;i<=10;i++) { // ;�� �ݵ�� �־�� ������ ���� ���̳� ���� ������ �� �ִ�.
			System.out.print(i+"\t");
		}
		for (; ; ) {
			System.out.print(i+"\t");
			if (i>10)break;
			i++;
		}
	}

}
