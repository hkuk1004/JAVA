package ch15;
import javax.swing.*;
public class Button1 extends JFrame{
	public Button1() {
		ImageIcon i1 = new ImageIcon("logo.gif");
		ImageIcon i2 = new ImageIcon("java.jpg");
		JButton btn1 = new JButton("稽壱",i1);
		JButton btn2 = new JButton("切郊",i2);
		btn1.setToolTipText("企酵せせせせせせせせせせせせせ");
		btn2.setToolTipText("榎推析戚陥 ");
		add("North", btn1); add("South",btn2);
		setSize(300,300); setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // windowClosing
	}
	public static void main(String[] args) {
		new Button1();
	}
}
