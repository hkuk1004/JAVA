package ch09;
public class Str4 {
	public static void main(String[] args) {
		//            0 123 4567 890 1234 5 6789 01 2 : 글자수는 23
		String str = "우리는 친구였어, 곁에 있으면 든든한 친구";
		// 인덱스 5부터 10번 앞에까지 출력
		System.out.println(str.substring(5, 10));
		// 공란(" ")구분하여 배열 strs를 만들고 배별 데이터 출력
		System.out.println("=============");
		String[] strs = str.split(" ");
		for (String st : strs) {
			System.out.println(st);
			// 배열 데이터 중에서 는으로 끝나는 단어 출력
			if (st.endsWith("는")) System.out.println("는으로 끝 : "+st);
			//    "          든으러 시작하는   "
			if (st.startsWith("든")) System.out.println("든으로 시작 : "+st);
		}
		System.out.println("=============");		
		for (int i = str.length() - 1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}