package ch04;

public class Ex01 {
	public static void main(String[] args) {
		int[] score = {75, 45, 34, 89, 100, 50, 90, 92};
		// 합계sum, 평균avg, 최고점max, 최소점min
		int sum =0, max = score[0] ,min = score[0]; // 최대값은 작은 값, 최소값은 큰 값으로 초기화
		float avg = 0.0f;
		for (int i=0; i<score.length; i++) {
			sum += score[i];
			if(score[i] > max) max = score[i];
			if(score[i] < min) min = score[i];
		}
		avg = (float)sum/score.length;
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(max);
		System.out.println(min);
		System.out.println("=====================");
		sum = 0;
		max = score[0];
		min = score[0];
		// 확장 for
		for(int sc : score) {
			sum += sc;
			if(sc>max) max = sc;
			if(sc<min) min = sc;
		}
		float avg2 = (float)sum/score.length;
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg2);
	}
}
