package EasyJava.ch08.interfaceExam;

public class SmartTV implements RemoteController, Searchable { // 6(다중 인터페이스 구현 클래스)
    // 다중 인터페이스를 구현할 경우, 구현 클래스는 모든 인터페이스의 추상 메서드에 대해 실체 메서드를 작성해야 한다.
    // 그렇지 않으면 추상 클래스로 선언해야 한다!
    private int volume;

    @Override // RemoteController 인터페이스 활용
    public void turnOn() { System.out.println("스마트 TV를 켭니다."); }
    @Override
    public void turnOff() { System.out.println("스마트 TV를 끕니다."); }
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteController.MAX_VOLUME) {
            this.volume = RemoteController.MAX_VOLUME;
        } else if (volume < RemoteController.MIN_VOLUME) {
            this.volume = RemoteController.MIN_VOLUME;
        } else {
            this.volume = volume;
        } // 볼륨의 최대값, 최소값 범위를 정의, 볼륨값 변경
        System.out.println("현재 스마트 TV의 볼륨 : " + volume);
    } // end of setVolume()
    @Override // Searchable 인터페이스 활용
    public void search(String url) { System.out.println(url +"을 검색합니다.");  }
}
