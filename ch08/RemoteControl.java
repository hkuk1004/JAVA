package ch08;
public interface RemoteControl {
	// ��� public static final ����
	int MAX_VOUME = 10;
	int MIN_VOUME = 0;
	// �߻� �޼��� public abstract ����
	void turnOn();
	void turnOff();

	// ����Ʈ �޼��� ����θ� ���� �� �ִ�
	default void setMute(boolean mute) {
		if (mute) System.out.println("���� ó���մϴ�");
		else System.out.println("���� ���� �մϴ�");
	}
	
	// static �޼��嵵 ����θ� ���� �� �ִ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ �մϴ�");
	}
}