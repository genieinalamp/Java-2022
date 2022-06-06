package EasyJava.ch03;

public class Ex3_05 { // 쉽자바 프로그래밍 문제 3-05
    // 각 변의 길이 합이 20 이하이며 각 변의 길이가 정수인 직각 삼각형의 모든 변을 구하라. for문 중첩사용하기
    public static void main(String[] args) {

        int a, b, c ; // 직각 삼각형 세 변, c가 빗변일 때

        for ( a = 1, b = 1, c = 1;  a + b + c <= 20; c++ ) {

            for ( ; ; b++ ) {


                for (; ; a++) {


                    if (a * a + b * b == c * c
                    && (c > b) && ( b > a )) {
                        System.out.println("(a, b, c) = ( " + a + ", " + b + ", " + c + " )");
                        //continue;

                    }
                }
            }


        } // end of for (오버라이딩 개미쳤?)
        System.out.println("(a, b, c) = ( " + a + ", " + b + ", " + c + " )");

    } // end of main

} // end of class
