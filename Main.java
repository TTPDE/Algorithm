import java.util.Iterator;
import java.util.Scanner;

class Main {

	//3.문장속 단어
//	public String solution(String str) {
//		String answer = "";
//		int m = Integer.MIN_VALUE;
//		String[] s = str.split(" ");
//		for (String x : s) {
//			int len = x.length();
//			if(len >m) {
//				m = len;
//				answer = x;
//			}
//		}
//		return answer;
//	}
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(" "))!=-1) { //indexof 제일 첫번째 조건 인덱스반환 못찾으면 -1반환
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		if(str.length()>m) answer = str;
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
