package ch08;
public class ReomoteControlEX2 {
	public static void main(String[] args) {
		// Ŭ������ ������ �ʰ� �߻�޼��带 �������ؼ� ��ü�� ������ �� �ִ�
		// ��ü�� �����ϸ� ��ü��(����������, ���۷��� ������)
		// ReomoteControlEX2$1��� Ŭ������ ���� ��ü�� ������ ����
		// ReomoteControlEX2$1�� ����(�͸�)Ŭ����
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("����Ŀ�� �մϴ�");				
			}
			public void turnOff() {
				System.out.println("����Ŀ�� ���ϴ�");					
			}
		}; // ��ü �����ϴ� ���� ����
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery();
		RemoteControl rc2 = new RemoteControl() {
			public void turnOn() {
				System.out.println("TV�� �մϴ�");				
			}
			public void turnOff() {
				System.out.println("TV�� ���ϴ�");					
			}
		}; // ��ü �����ϴ� ���� ����
		rc2.turnOn();
		rc2.turnOff();
		rc2.setMute(true);
		RemoteControl.changeBattery();
	}
}