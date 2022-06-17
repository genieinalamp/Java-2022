package EasyJava.ch07;

public class RemoteControllerExam { // 3(구현 클래스 생성 - 람다식, 자바8)
    /*
    구현 클래스 (TV, Audio)가 작성되면 new 연산자로 객체를 생성할 수 있다.
    인터페이스로 구현 객체를 사용하려면 인터페이스 변수(참조타입)를 선언하고 구현 객체를 대입한다!
    인터페이스 변수; 변수 = 구현객체;
    -> 인터페이스 변수 = new 구현 객체();
     */
    public static void main(String[] args) {

        RemoteController.changeBattery(); // 9 (정적 메서드 사용 - new 없이 바로 사용할 수 있다)

        // 4 - 익명의 구현 객체 생성 (일회성)
        /*
        인터페이스 변수 = new 인터페이스(){ // 클래스 선언, 추상 메서드의 실체 메서드 선언(없으면 컴파일 오류) };
        중괄호 뒤에 세미콜론 필수!!!
        추가적으로 필드&메서드 선언 가능하지만, 익명 객체 안에서만 사용할 수 있으며 인터페이스 변수로 접근 불가
         */
        RemoteController rc = new RemoteController() {
            @Override
            public void turnOn() {
                // 실행문
            }

            @Override
            public void turnOff() {
                // 실행문
            }

            @Override
            public void setVolume(int volume) {
                // 실행문
            }
        }; // 인터페이스를 객체로 생성하여 익명 구현하는 객체!

//        TV tv = new TV(); // 인터페이스 사용하지 않고 객체 생성하여 사용
//        tv.turnOn();
//        tv.turnOff();
//
//        RemoteController rc; // 인터페이스를 변수에 저장한다.
//        rc = new TV(); // TV 객체를 인터페이스에 연결
//        rc.turnOn();
//        rc.turnOff();
//
//        rc = new Audio(); // Audio 객체를 인터페이스에 연결
//        rc.turnOn();
//        rc.turnOff();

        // 7(추상 메서드 사용) 8(디폴트 메서드 사용 - 인터페이스에 선언되지만 인터이스에서 바로 사용할 수 없다.)
        // 디폴트 메서드는 추상 메서드가 아닌 인스턴스 메서드이므로 구현 객체가 있어야 사용 가능하다.
        // 디폴트 메서드는 인터페이스의 모든 구현 객체가 가지고 있는 기본 메서드이다. (오버라이딩 가능)의
        // 오디오 클래스에 이어서!
        RemoteController rc1 = null; // 인터페이스를 변수에 참조타입으로 null 값을 넣는다.
        rc1 = new TV(); // TV 객체를 인터페이스에 연결
        rc1.turnOn();
        rc1.setMute(true); // 인터페이스 디폴트 오버라이딩
        rc1.setMute(false);
        rc1.turnOff();

        RemoteController rc2 = new Audio(); // 오디오 객체를 인터페이스에 바로 연결
        rc2.turnOn();
        rc2.setMute(true); // 인터페이스 디폴트 오버라이딩
        rc2.setMute(false);
        rc2.turnOff();

    }
}
