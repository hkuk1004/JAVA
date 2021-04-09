package ch13;
import java.awt.*;
import  java.awt.event.*;
public class ActionEv1 extends Frame implements ActionListener{
	Button btn;// 이벤트 처리한 컴퍼넌트는 전역 변수로 선언
	TextArea ta;
	public ActionEv1() {
		btn = new Button("버튼을 클릭 하세요");
		ta = new TextArea();
		add("North", btn);
		add("Center",ta);
		setSize(300,300);
		setVisible(true);
		// ActionListener 버튼 클릭, List 또는 Choice에 선택,
		btn.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new ActionEv1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 텍스트 에어리어에 글자를 붙이고 줄 바꾸기
		ta.append("버튼 눌렀네 \n");
	}
	
}
