package ch05;

public class Car_2 {
	String carNo; // 차량번호
	int inTime; // 입차시간
	int outTime; // 출차시간
	int fee; // 주차요금
	final int MONEYPERHOUR = 5000; // 시간당 요금
	// 생성자를 통하여 c,in,out
	Car_2(String c, int in, int out){
		carNo = c; inTime = in; outTime = out;
	}
	void calFee() {
		// (출고시간 - 입고시간) * 시간당요금
		fee = (outTime - inTime) * MONEYPERHOUR;
	}
	void print() {
		System.out.println("========================");
		System.out.println("차량 번호 : "+carNo);
		System.out.println("입차 시간 : "+inTime);
		System.out.println("출차 시간 : "+outTime);
		System.out.println("주차 요금 : "+ fee);
	}
	
}
