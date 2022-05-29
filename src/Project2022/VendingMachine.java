package Project2022;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {


        int button; // 자판기 입력버튼
        int coin; // 자판기 투입할 동전
        int cash = 30000; // 자판기 시재
        int price1, price2, price3, price4; // 음료수 가격
        String drink1, drink2, drink3, drink4; // 음료수 종류


        boolean on = true; // 자판기 작동 스위치
        boolean mong = true; // 관리자 메뉴

        Scanner in = new Scanner(System.in);

        while (on) {
            System.out.println("===================");
            System.out.println("자판기를 작동합니다.");
            System.out.print("버튼을 입력하세요. >>");

            button = in.nextInt();
            switch (button) {
                case 1:
                    System.out.print("동전을 투입하세요! >>");
                    coin = in.nextInt();
                    System.out.println(coin + "원을 투입했습니다!");
                    break;

                case 2:
                case 3:
                case 4:
                case 5:
                case 6:

            }


        } // 자판기 on
    } // end of main
} // end of class
