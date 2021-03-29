package ch04;

public class Lotto1 {
	public static void main(String[] args) {
		// 1 ~ 45 랜덤한 값
		int[] lotto = new int[6];
		// 저장소
		int temp = 0;
		for(int i=0; i<lotto.length; i++) {
			//   0 ~ 44  0.0001~44.9999
			lotto[i] = (int)(Math.random()*45) + 1;
			// 앞에 데이터와 비교해서 같으면 다시 숫자 생성
			for(int j=i-1; j >= 0; j--) { // 인덱스 0번까지 값 비교
				if(lotto[j] == lotto[i]) {
					i--; // 이전 인덱스로 돌아가서 다시 생성
					break; 
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		// 중복이 있는 for문
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
