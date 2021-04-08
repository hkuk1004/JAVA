package ch11;
public interface Car {
	void print();
}
class Bus implements Car {
	public void print() {	System.out.println("난 버스야");			}
	void move() {			System.out.println("40명을 태우고 다녀");	}
}
class Taxi implements Car {
	public void print() {
		System.out.println("난 택시야");
	}
}
class FireEngine implements Car {
	public void print() {
		System.out.println("난 불 자동차야");
	}
}
class Ambulance {
	public void print() {
		System.out.println("난 앰블런스야");
	}
}