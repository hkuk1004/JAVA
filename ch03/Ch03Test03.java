package ch03;

public class Ch03Test03 {
	public static void main(String[] args) {
		 for (int i=1; i<=6; i++) { //첫번째 주사위
			 for(int j=1; j<=6; j++) { //두번째 주사위
				 if(i+j == 6)
					 System.out.printf("%d + %d = %d\n", i,j,i+j);
			 }
		 }
	}
}
