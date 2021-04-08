package ch11;
import java.util.ArrayList;
public class Gene2 {
	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Bus());  		list.add(new Taxi());
		list.add(new FireEngine()); // list.add(new Ambulance());
// Generic 클래스를 사용하면 그 클래스 또는 상속받은 크래스, 구현한 클래스만 사용 가능 
// 각각의 개체를 사용하여 print()실행
// 그 객체가 Bus 객체면 move()실행
		for(Car car :list ) {
			car.print();
			if (car instanceof Bus)
				((Bus)car).move();
		}
	}
}