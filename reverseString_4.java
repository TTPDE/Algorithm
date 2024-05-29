//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class Main {
//
//    //4.단어뒤집기
//    public List<String> solution(int n, String[] str) {
//        List<String> answer = new ArrayList<>();
//        for(String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        String[] str = new String[n];
//        for (int i=0; i<n; i++) {
//            str[i] = kb.next();
//        }
//        for (String x : T.solution(n, str)) {
//            System.out.println(x);
//        }
//    }
//}
