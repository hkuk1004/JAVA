package ch10;
// import java.io.IOException
public class Throws2 {
	public static void main(String[] args) /*throws IOException*/{
		System.out.println("���ڸ� �Է��ϼ���");
		try {
			int num = System.in.read() - '0';
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}