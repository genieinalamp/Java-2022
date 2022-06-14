package EasyJava.ch08.interfaceExam;

public class TV implements RemoteController { // 2-1)
    // 필드
    private int volume; // 볼륨 조절 필드

    // 인터페이스 RemoteController - 추상 메서드의 실체 메서드
    @Override
    public void turnOn() { System.out.println("TV를 켭니다."); }
    @Override
    public void turnOff() { System.out.println("TV를 끕니다."); }
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteController.MAX_VOLUME) {
            this.volume = RemoteController.MAX_VOLUME;
        } else if (volume < RemoteController.MIN_VOLUME) {
            this.volume = RemoteController.MIN_VOLUME;
        } else {
            this.volume = volume;
        } // 볼륨의 최대값, 최소값 범위를 정의, 볼륨값 변경
        System.out.println("현재 TV의 볼륨 : " + volume);
    } // end of setVolume()
}
