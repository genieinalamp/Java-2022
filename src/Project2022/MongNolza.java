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

        boolean mong = true; // 메뉴 켜짐!
        int roomnum; // 방번호
        String answer;

        String[] room = new String[13]; // 방 12개 생성 (0번은 비어있음)
        String unavailable = "예약 불가";
        String available = "예약 가능";
        room[0] = unavailable; // 0번방은 탕비실
        int i = 1;
        for (; i < room.length ; i++) {
            room[i] = available;
        }


        System.out.println("==========몽놀자 방예약 시스템 ver.1=========");
        while ( mong ) {
            System.out.println("            몽놀자 on!"); // 예약메뉴 보여주기
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("=================[menu]=================");


            int num; // 메뉴 선택버튼

            System.out.println("1. 예약하기 2. 예약취소 3. 호실보기 99. 종료 ");
            System.out.print("메뉴를 선택하세요 >> ");

            num = scan.nextInt();

            switch (num) {

                case 1: // 예약하기 - 호실 선택 - 예약가능여부 - 예약진행 - 메뉴복귀


                    System.out.printf("예약할 호수를 입력해주세요! : ");

                    roomnum = scan.nextInt();

                    if (room[roomnum].equals(available)  ) {
                        room[roomnum] = unavailable;
                        System.out.println(roomnum + "호 예약이 완료되었습니다. ");

                    }


                    System.out.println("메뉴로 돌아갑니다. ");

                    break;

                case 2: // 예약취소 - 진짜 취소? 수수료 ㅇㅇ - 취소 진행 - 메뉴복귀

                    System.out.printf("예약 취소할 호수를 입력해주세요! : ");

                    roomnum = scan.nextInt();

                    if (room[roomnum].equals(unavailable)) {
                        System.out.println("진짜로 취소하시겠습니까? 수수료 있음 ㅇㅇ");
                        System.out.println(" yes / no ");
                        answer = scan.next();
                        if (answer.equals("yes")) {
                            room[roomnum] = available;
                            System.out.println(roomnum + "호의 예약이 취소되었습니다.");
                        } else if (answer.equals("no")) {
                            System.out.println("메뉴로 돌아갑니다. ");
                        }

                    } else System.out.println("예약이 되어있지 않은 방입니다. 메뉴로 돌아갑니다. ");



                    break;

                case 3: // 호실보기 - 호수 누르고 - 예약됨 or 예약가능
                    System.out.println();
                    System.out.println("            ⟪현재 예약 가능한 방 ⟫");
                    int j=1;
                    for(; j<room.length; j++){
                        if ( room[j].equals(available)  )
                            System.out.print( j + "호 ");
                    }
                    System.out.println();
                    System.out.println();

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
