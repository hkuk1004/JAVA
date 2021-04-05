package ch08;
public class ReomoteControlEX2 {
	public static void main(String[] args) {
		// 클래스를 만들지 않고 추상메서드를 재정의해서 객체를 생성할 수 있다
		// 객체를 생성하면 객체명(참조변수명, 테퍼런스 변수명)
		// ReomoteControlEX2$1라는 클래스를 만들어서 객체를 생성한 것임
		// ReomoteControlEX2$1는 무명(익명)클래스
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("스피커를 켭니다");				
			}
			public void turnOff() {
				System.out.println("스피커를 끕니다");					
			}
		}; // 객체 생성하는 문장 종료
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery();
		RemoteControl rc2 = new RemoteControl() {
			public void turnOn() {
				System.out.println("TV를 켭니다");				
			}
			public void turnOff() {
				System.out.println("TV를 끕니다");					
			}
		}; // 객체 생성하는 문장 종료
		rc2.turnOn();
		rc2.turnOff();
		rc2.setMute(true);
		RemoteControl.changeBattery();
	}
}