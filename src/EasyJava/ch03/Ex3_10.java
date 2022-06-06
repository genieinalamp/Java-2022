package EasyJava.ch03;

import java.util.Scanner;

public class Ex3_10 {
    public static void main(String[] args) { // prime number: 1보다 크면서 1과 자신 외에는 나누지 않는 수
        System.out.print("양의 정수를 입력하세요 : ");
        int num = new Scanner(System.in).nextInt();
        if (isPrime(num))
            System.out.println(num + "는 소수입니다.");
        else System.out.println(num + "는 소수가 아닙니다.");
    }

    static boolean isPrime(int x) {
        boolean result = true;
        for (int j = 2; j < x; j++) {
            if (x % j == 0 ) {
                return false;
            } else {
                continue;
            }
        } return result;
    }
}
