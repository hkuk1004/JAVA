package ch04;

public class StrArr1 {
	//					 args[0]	args[1]	args[2]		args[3]
	// java ��Ű����/���α׷� ù��°������ �ι�°������ ����°������ �׹�°������
	//String[] str = {"�ֺҷ�","��ҷ�","������"};
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
