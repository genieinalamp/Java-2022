package EasyJava.ch07.pro04;

public class TalkableTest {
    static void speak(Talkable a){
        a.talk();

    } // end of speak()

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}
