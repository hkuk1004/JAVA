package ch19;

import java.util.stream.IntStream;

public class FromIntSt2 {
	static int sum = 0;
	public static void main(String[] args) {
		// 1부터 100 앞까지 즉, 1부터 99까지
		// IntStream stream = IntStream.range(1,100);
		// 1부터 100까지
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(x->sum+=x);
		System.out.println("합계 : " + sum);
	}
}
