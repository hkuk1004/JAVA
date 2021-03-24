package ch03;

public class If4 {
	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		// money가 1000000보다 크면 비행기 타세요
		// money가 100000보다 크면 KTX 타세요
		// money가 50000보다 크면 택시 타세요
		// money가 10000보다 크면 버스 타세요
		// 아니면 걸어가세요
		if(money > 1000000)
			System.out.println("비행기 타세요");
		else if(money > 100000)
			System.out.println("KTX 타세요");
		else if(money > 50000)
			System.out.println("택시 타세요");
		else if(money > 10000)
			System.out.println("버스 타세요");
		else
			System.out.println("걸어가세요");
	}
}
