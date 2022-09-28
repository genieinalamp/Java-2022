package Chapter7;

class MyTv2{

    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel; // 이전 채널!

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // getter setter 메서드 추가하기
    public int getChannel(){
        return channel;
    }
    public int getVolume(){
        return volume;
    }
    public void setChannel(int channel){
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;

        prevChannel = this.channel; // 현재 채널을 이전 채널에 저장한다!
        this.channel = channel;

    }
    public void setVolume(int volume){
        if (volume > MAX_VOLUME) {
            channel = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    void gotoPrevChannel(){
        // 현재 채널을 이전 채널로 변경하는메서드
        setChannel(prevChannel); // 현재 채널을 이전 채널로 변경한다!




    }

}
public class Exercise7_5 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());

    }
}
