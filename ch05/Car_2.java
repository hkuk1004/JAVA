package ch05;

public class Car_2 {
	String carNo; // ������ȣ
	int inTime; // �����ð�
	int outTime; // �����ð�
	int fee; // �������
	final int MONEYPERHOUR = 5000; // �ð��� ���
	// �����ڸ� ���Ͽ� c,in,out
	Car_2(String c, int in, int out){
		carNo = c; inTime = in; outTime = out;
	}
	void calFee() {
		// (���ð� - �԰�ð�) * �ð�����
		fee = (outTime - inTime) * MONEYPERHOUR;
	}
	void print() {
		System.out.println("========================");
		System.out.println("���� ��ȣ : "+carNo);
		System.out.println("���� �ð� : "+inTime);
		System.out.println("���� �ð� : "+outTime);
		System.out.println("���� ��� : "+ fee);
	}
	
}
