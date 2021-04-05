package ch09;

public class String4 {
	public static void main(String[] args) {
		String str = "우리는 친구였어, 곁에있으면 든든한 친구";
		// 인덱스 5부터 10번 앞에까지 출력
		System.out.println(str.substring(5,10));
		// 공란(" ")구분하여 배열 strs를 만들고 배열 데이터 출력
		System.out.println("==========");
		String[] strs = str.split(" ");
		for (String st : strs) {
			System.out.println(st);
			// 배열 데이터중에서 는으로 끝나는 단어 출력
			if(st.endsWith("는")) System.out.println("는으로 끝 : "+st);
			//	      "        든으로 시작하는  "
			if(st.endsWith("든")) System.out.println("든으로 시작 : "+st);	
		}
		System.out.println("==========");
		// 글을 뒤집어서 출력
		// 구친 한든든 면~          이루
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i)); // 해당하는 인덱스 의 문자 한잔
		}
	}
}
