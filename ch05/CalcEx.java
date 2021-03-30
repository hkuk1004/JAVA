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
		// 정사각형 넓이 width * width
		System.out.println("정사각형 넓이 : "+width*width);
	}
	void rectangle() {
		// 직사각형 넓이 width * height
		System.out.println("직사각형 넓이 : " + width*height);
	}
	void hexa() {
		// 직육면체 부피 width * height * depth
		System.out.println("직육면체 부피 : " + width*height*depth);
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
