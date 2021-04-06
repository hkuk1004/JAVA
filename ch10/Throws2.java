package ch10;
// import java.io.IOException
public class Throws2 {
	public static void main(String[] args) /*throws IOException*/{
		System.out.println("숫자를 입력하세요");
		try {
			int num = System.in.read() - '0';
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
