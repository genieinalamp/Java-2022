package Chapter7;

class MyTv{
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // getter setter 메서드 추가하기
    public int getChannel(){
       // this.channel = channel;
        return channel;
    }
    public int getVolume(){
       // this.volume = volume;
        return volume;
    }
    public void setChannel(int channel){
        if (channel > MAX_CHANNEL) {
            channel = MAX_CHANNEL;
        } else if (channel < MIN_CHANNEL) {
            channel = MIN_CHANNEL;
        } else {
            this.channel = channel;
        }
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

}

public class Exercise7_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL: " + t.getVolume());
    }
}
