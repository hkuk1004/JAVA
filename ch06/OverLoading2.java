package ch06;
class Box{
	int volume(int x, int y, int z) {
		return x * y * z;
	}
	double volume(double x, double y, double z) {
		return x * y * z;
	}
}
public class OverLoading2 {
	public static void main(String[] args) {
		Box box = new Box();
		System.out.println("�����ڽ� ���� : "+ box.volume(12, 15, 20) );
		System.out.println("�Ǽ��ڽ� ���� : " + box.volume(12.5, 7.5, 3.4));
		System.out.println("��/�Ǽ��ڽ� ���� : "+box.volume(12.5, 7.5, 3));
	}
}
