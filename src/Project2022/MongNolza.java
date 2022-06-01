package Project2022;
/* 방 예약하기 - ver1.0
 * 키보드에 의한 입력작성.
 * 12개의 방이 존재-> int[] room = new int[12];
 * 초기값은 0  => 예약가능, 1 => 예약불가
 * ===== 반복하기 ======
 * [ 메뉴 ]
 * 1. 예약하기   2. 예약취소   3. 호실보기   99.종료
 * select :
 * -------------------------------------------
 * - 3을 누른경우는 호실보기  => 1이면 "예약됨:★ ", 0이면  "예약가능☆"
 * 0번 호실 : 예약가능☆
 * 1번 호실 : 예약가능☆
 * 2번 호실 : 예약됨:★
 * 12번 호실 : 예약가능☆
 * - 1을 누른경우
 * -> 호실번호 선택(1~12)  -> 예약상태여부확인
 * -> 예약가능상태 -> 예약실시 -> 메뉴복귀
 * -> 예약불가상태  -> 메뉴로 복귀 또는 호실번호선택으로
 *
 * 예약자명	revName, 예약번호	revPass 추가하기
 */
import java.util.Scanner;

public class MongNolza { // 몽놀자 방예약 시스템

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] room = new int[12]; // 방 12개 생성
        for ( int i = 1; i<=room.length; i++) {
            room[i] = i; // 배열 객체생성
            //System.out.println(room[i]);
        }

        int num; // 메뉴 선택버튼
        boolean mong = true; // 메뉴 켜짐!


        System.out.println("========몽놀자 방예약 시스템 ver.1=======");
        while ( mong ) {
            System.out.println("            몽놀자 on!"); // 예약메뉴 보여주기
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("===============[menu]===============");
            System.out.println("1. 예약하기 2. 예약취소 3. 호실보기 99. 종료 ");
            System.out.print("메뉴를 선택하세요 >> ");
            num = scan.nextInt();

            switch (num) {
                case 1: // 예약하기 - 호실 선택 - 예약가능여부 - 예약진행 - 메뉴복귀

                    break;

                case 2: // 예약취소 - 진짜 취소? 수수료 ㅇㅇ - 취소 진행 - 메뉴복귀

                    break;

                case 3: // 호실보기 - 호수 누르고 - 예약됨 or 예약가능

                    break;

                case 99: // 시스템 종료
                    mong = false;
                    System.out.println("몽놀자 시스템을 종료합니다. ");
                    System.out.println("이용해주셔서 감사합니다 (__꾸벅) ");

                    break;

        } // end of switch



        } // end of while


    } // end of main

} // end of class
