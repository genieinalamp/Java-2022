package EasyJava.ch07.sec05;

class Icon{
    interface Touchable{ // 중첩 인터페이스
        void touch();
    }
}
public class InnerInterfaceDemo implements Icon.Touchable {
    public void touch(){
        System.out.println("아이콘을 터치한다.");
    }

    public static void main(String[] args) {
        Icon.Touchable btn = new InnerInterfaceDemo();
        btn.touch();
    }
}
