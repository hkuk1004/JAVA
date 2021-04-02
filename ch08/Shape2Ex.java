package ch08;
public class Shape2Ex {
	public static void main(String[] args) {
		Shape2[] shs = {new Circle2(), new Rectangle2(), new Triangle2()};
		for (Shape2 sh : shs) {
			sh.computeArea();
			sh.print();
		}
		
	}
}