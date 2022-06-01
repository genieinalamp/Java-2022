package JavaExercise;

import java.util.Scanner;

public class Factorial { // 팩토리얼 값을 계산하는 프로그램을 반복문, 조건문, 메서드 등을 사용해서 작성해보자!
    public static void main(String[] args) {

        int result; // 팩토리얼 결괏값 저장
        int n; // 키보드에서 입력받을 정수 저장
        Scanner in = new Scanner(System.in);
        System.out.print("팩토리얼 값을 구할 정수 : ");
        n = in.nextInt();
        result = factorial(n);
        System.out.println(result);
        System.out.println("(1,5) " + (factorial(1,5)));
        System.out.println("(3,5) " + (factorial(3, 5)));
        System.out.println("(10,5) " + (factorial(10,5)));

        }

    static int factorial ( int x ) { // 반환값이 int이고 매개변수가 int x인 static 메서드!
        int r = 1;
        while ( x > 0 ) {
                r = r * x;
                x--;
            }
        return r;
    } // end of method

    static int factorial ( int x, int y ) {
        int r = 1;
        // 구간 팩토리얼 메서드 오버로딩하기!
        while (x <= y ) {
            r = r * x;
            x++;
        }
        return r;
    } // end of method

//        result = 1;
//        while ( true ) { // while문을 true로 수정한 후 조건문 사용해 다시 코드짜기
//            for ( ; n>=1; n-- ) {
//                result = result * n;
//            }
//            break;
//            }
//        System.out.println(result);

} // end of class

