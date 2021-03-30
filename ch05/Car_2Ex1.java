package ch05;

public class Car_2Ex1 {
	public static void main(String[] args) {
		Car_2 c1 = new Car_2("°¡ 1234",10,13);
		Car_2 c2 = new Car_2("´Ù 4569",13,14);
		Car_2 c3 = new Car_2("³ª 5567",12,17);
		
		c1.calFee();
		c2.calFee();
		c3.calFee();
		c1.print();
		c2.print();
		c3.print();
	}
}
