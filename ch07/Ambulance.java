package ch07;
public class Ambulance extends Car {
	public Ambulance(String kind, int inwon) {	setKind(kind); setInwon(inwon);	}
	void printAm() {
		print();
		System.out.println("ȯ�ڸ� �¿�� ����");
	}
}
class Bus extends Car {
	public Bus(String kind, int inwon) {	setKind(kind); setInwon(inwon);	}
	void printBus() {
		print();
		System.out.println("���� �մ��� �ư� ����Ѵ�");
	}
}
class FireEngine extends Car {
	public FireEngine(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}
	void printFe() {
		print();
		System.out.println("�Ҳ��� ���ؼ� �⵿�Ѵ�");
	}
}