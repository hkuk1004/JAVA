package ch04;

public class StrArr1 {
	//					 args[0]	args[1]	args[2]		args[3]
	// java 패키지명/프로그램 첫번째데이터 두번째데이터 세번째데이터 네번째데이터
	//String[] str = {"왜불러","배불러","배터져"};
	//for(int i=0; i<str.length; i++){
	//	System.out.println(str[i]);
	//}
	// for(String st : str){
	// 		System.out.println(st);
	// }
	public static void main(String[] args) {
		for (String str : args) {
			System.out.println(str);
		}
		System.out.println("===================");
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
