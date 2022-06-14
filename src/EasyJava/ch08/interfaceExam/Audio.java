package EasyJava.ch08.interfaceExam;

public class Audio implements RemoteController { // 2-2)
    // 필드
    private int volume; // 볼륨 조절 필드
    private boolean mute; // 음소거 필드

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if (mute) {
            System.out.println("오디오 음소거 처리 완료");
        } else System.out.println("오디오 음소거 해제 완료");
    } // (8 디폴트 메서드 오버라이딩)


    // 인터페이스 RemoteController - 추상 메서드의 실체 메서드 : 작성하지 않으면 자동적으로 추상 클래스가 된다!!
    @Override
    public void turnOn() { System.out.println("오디오를 켭니다."); }
    @Override
    public void turnOff() { System.out.println("오디오를 끕니다."); }
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteController.MAX_VOLUME) {
            this.volume = RemoteController.MAX_VOLUME;
        } else if (volume < RemoteController.MIN_VOLUME) {
            this.volume = RemoteController.MIN_VOLUME;
        } else {
            this.volume = volume;
        } // 볼륨의 최대값, 최소값 범위를 정의, 볼륨값 변경
        System.out.println("현재 Audio 볼륨 : " + volume);
    } // end of setVolume()
}
