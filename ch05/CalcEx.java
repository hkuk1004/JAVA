package ch05;
class Calc{
	int width, height, depth;
	Calc (int w){
		width = w;
	}
	Calc (int w, int h){
		width = w; height = h;
	}
	Calc (int w, int h, int d){
		width = w; height = h; depth = d;
	}
	void square() {
		// ���簢�� ���� width * width
		System.out.println("���簢�� ���� : "+width*width);
	}
	void rectangle() {
		// ���簢�� ���� width * height
		System.out.println("���簢�� ���� : " + width*height);
	}
	void hexa() {
		// ������ü ���� width * height * depth
		System.out.println("������ü ���� : " + width*height*depth);
	}
}
public class CalcEx {
	public static void main(String[] args) {
		Calc c1 = new Calc(10);
		Calc c2 = new Calc(10,20);
		Calc c3 = new Calc(10,20,30);
		
		c1.square();
		c2.rectangle();
		c3.hexa();
	}
}
