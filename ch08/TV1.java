package ch08;

public class TV1  implements RemoteControl {
	public void turnOn() {
		System.out.println("TV�� �մϴ�");		
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");			
	}
}

class Radio1 implements RemoteControl {
	public void turnOn() {
		System.out.println("������ �մϴ�");		
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�");			
	}
}