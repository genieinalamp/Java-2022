package EasyJava.ch05;

public class Ex5_01 {
    public static void main(String[] args) { // 문자열 s에 포함된 문자 c의 개수를 반환하는 메서드 구현하기

        System.out.println( 'l'+ "의 개수는 : " + countChar("hello", 'l'));

    } // end of main

    static int countChar(String s, char c) { // 메서드 생성
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        return sum;

    } // end of method
} // end of class

