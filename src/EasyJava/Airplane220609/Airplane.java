package EasyJava.Airplane220609;

public class Airplane {
    // 필드
    Tire frontTire = new Tire("앞쪽", 4);
    Tire backLeftTire = new Tire("뒤왼쪽", 6);
    Tire backRightTire = new Tire ("뒤오른쪽", 5);
    // 비행기의 부품인 타이어 3개 객체를 생성한다. (위치, 마일리지)
    // 생성자
    // 메서드 roll 소환하여 주행 여부를 판단
    int run() {
        if (frontTire.roll() == false) {stop(); return 1;}
        if (backLeftTire.roll() == false) {stop(); return 2;}
        if (backRightTire.roll() == false) {stop(); return 3;}
        return 0;
        } // 정상 주행이면 0을 리턴, 펑크시 1~4까지 위치 정보를 리턴한다.
    void stop() {
        System.out.println("자동차가 멈춥니다." );// 펑크났을 때
    }
}
