package ch07;
public class Ambulance extends Car {
	public Ambulance(String kind, int inwon) {	setKind(kind); setInwon(inwon);	}
	void printAm() {
		print();
		System.out.println("환자를 태우고 간다");
	}
}
class Bus extends Car {
	public Bus(String kind, int inwon) {	setKind(kind); setInwon(inwon);	}
	void printBus() {
		print();
		System.out.println("많은 손님을 싣고 출발한다");
	}
}
class FireEngine extends Car {
	public FireEngine(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}
	void printFe() {
		print();
		System.out.println("불끄기 위해서 출동한다");
	}
}