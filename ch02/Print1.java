package ch02;

public class Print1 {
	public static void main(String[] args) {
		System.out.printf("%d\n", 16); // 16출력
		System.out.printf("%5d\n", 16); // 5칸 확보하고 16출력
		System.out.printf("%-5d\n", 16); // 5칸 확보하고 앞에서부터 16출력
		System.out.printf("%05d\n", 16); // 5칸 확보하고 숫자가 없는 곳은 0으로 채우고 16출력
	}
}
