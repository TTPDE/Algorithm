//import java.util.Scanner;
//
//class Main {
//
//	//2.대소문자 변환
//	public String solution(String str) {
//		String answer = "";
//		char[] charArray = str.toCharArray();
//		for (char a : charArray) {
//			if (Character.isLowerCase(a)) {
//				answer += Character.toUpperCase(a);
//			} else {
//				answer += Character.toLowerCase(a);
//			}
//		}
//		return answer;
//	}
//
//	public static void main(String[] args) {
//		Main T = new Main();
//		Scanner kb = new Scanner(System.in);
//		String str = kb.next();
//		System.out.println(T.solution(str));
//	}
//}