package EasyJava.Airplane220609;

public class AirplaneExam {
    public static void main(String[] args) {
        Airplane a1 = new Airplane();

        for (int i = 1; i<= 10; i++) {
            int problemLocation = a1.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞쪽 한국 타이어로 교체");
                    a1.frontTire = new HankookTire("앞쪽", 10);
                    break;
                case 2:
                System.out.println("뒤왼쪽 한국 타이어로 교체");
                a1.frontTire = new HankookTire("뒤왼쪽", 20);
                break;
                case 3:
                System.out.println("뒤오른쪽 금호 타이어로 교체");
                a1.frontTire = new HankookTire("뒤오른쪽", 15);
                break;
            } // 마일리지 소모 후 자동 교체되는 코드
            System.out.println("-------------------------------");
        } // 1회전 종료에 대한 구분선
    } // end of main
} // end of class
