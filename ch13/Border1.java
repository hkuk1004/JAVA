package ch13;
import java.awt.*;
public class Border1 extends Frame {
	public Border1() {
		setLayout(new BorderLayout()); // Frame�� default�̹Ƿ� ��������
		// �� �� �� �� �߾�
		add("North",new Button("����"));
		add("South",new Button("����"));
		add("East",new Button("����"));
		add("West",new Button("����"));
		add("Center",new Button("�߾�"));
		
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Border1();
	} 
}
