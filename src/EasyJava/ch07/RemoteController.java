package EasyJava.ch07;

public interface RemoteController { // 1) 리모컨을 예로 인터페이스 실습!
    // ***인터페이스 구성 멤버 : 상수, 추상 메서드, 디폴트 메서드, 정적 메서드***

    // 상수
    public static final int MAX_VOLUME = 50;
    int MIN_VOLUME = 0; // public static final 모두 생략 가능 (자동 컴파일)

    // 추상 메서드
    public abstract void turnOn();
    abstract void turnOff(); // 인터페이스에 선언된 추상 메서드는 모두 public abstract 이므로 생략 가능
    void setVolume(int volume); // 볼륨 조절 (setter 활용)

    // 디폴트 메서드
    default void setMute (boolean mute) {
        if (mute){
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    } // end of method setMute

    // 정적 메서드 - 자바8 이상 지원가능, public 생략가능 (자동 컴파일)
    public static void changeBattery(){
        System.out.println("건전지를 교환합니다.");
    }

} // end of class
