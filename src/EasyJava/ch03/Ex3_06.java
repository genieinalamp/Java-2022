package EasyJava.ch03;

import java.util.Scanner;

public class Ex3_06 { // 쉽자바 프로그래밍 문제 3-06
    public static void main(String[] args) { // 철수와 영희의 가위바위보 게임!

//        String chulsoo, younghee;
        Scanner scan = new Scanner(System.in);
//        System.out.print("철수 : ");
//        chulsoo = scan.next();
//        System.out.print("영희 : ");
//        younghee = scan.next();
//
//        if (chulsoo.equals(younghee)) {
//            System.out.println("무승부");
//        } else if ((chulsoo.compareTo(younghee) == -2) || (chulsoo.compareTo(younghee) == -1) || (chulsoo.compareTo(younghee) == 3)) {
//            System.out.println("철수, 승!");
//        } else if ((younghee.compareTo(chulsoo) == -2) || (younghee.compareTo(chulsoo) == -1) || (younghee.compareTo(chulsoo) == 3)) {
//            System.out.println("영희, 승!");
//        } // else System.out.println("다시 입력하세요! (r, s, p)");
        String c = input("철수");
        String y = input("영희");
        whosWin(c, y);


        } // end of main

    static Scanner newScanner = new Scanner(System.in);


    static String input ( String name) { // input 메서드
        //System.out.print("철수 : ");
        name = newScanner.next();
        return name;
    }

    static void whosWin ( String c, String y ) {
        if (c.equals(y)) {
            System.out.println("무승부");
        } else if ((c.compareTo(y) == -2) || (c.compareTo(y) == -1) || (c.compareTo(y) == 3)) {
            System.out.println("철수, 승!");
        } else if ((y.compareTo(c) == -2) || (y.compareTo(c) == -1) || (y.compareTo(c) == 3)) {
            System.out.println("영희, 승!");
        }
        return;
    }


} // end of class