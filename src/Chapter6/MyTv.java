package Chapter6;

public class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){
        // isPOwerOn의 값이 true면 false로, false면 true로 바꾼다.
        if (isPowerOn == true) {
            isPowerOn = false;
        } else {
            isPowerOn = true;
        }
    }

    void volumeUp(){
        // volume의 값이 최대볼륨보다 작을때만 값을 1증가시킨다.
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    void volumeDown(){
        // volume의 값이 최소볼륨보다 클때만 값을 1감소시킨다.
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }

    void channelUp(){
        if (channel < MAX_CHANNEL) {
            channel++;
        } else if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        }
    }

    void channelDown(){
        if (channel > MIN_CHANNEL){
            channel--;
        } else if (channel == MIN_CHANNEL){
            channel = MAX_CHANNEL;
        }
    }

}
