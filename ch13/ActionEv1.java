package ch13;
import java.awt.*;
import  java.awt.event.*;
public class ActionEv1 extends Frame implements ActionListener{
	Button btn;// �̺�Ʈ ó���� ���۳�Ʈ�� ���� ������ ����
	TextArea ta;
	public ActionEv1() {
		btn = new Button("��ư�� Ŭ�� �ϼ���");
		ta = new TextArea();
		add("North", btn);
		add("Center",ta);
		setSize(300,300);
		setVisible(true);
		// ActionListener ��ư Ŭ��, List �Ǵ� Choice�� ����,
		btn.addActionListener(this); // ��ư�� �������� üũ
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) { // x�� Ŭ��������
				System.exit(0); //���α׷� ��������
			}
		});
		
	}
	public static void main(String[] args) {
		new ActionEv1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// �ؽ�Ʈ ���� ���ڸ� ���̰� �� �ٲٱ�
		ta.append("��ư ������ \n");
	}
	
}
