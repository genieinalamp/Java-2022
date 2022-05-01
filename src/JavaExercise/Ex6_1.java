package JavaExercise;

public class Ex6_1 {
    public static void main(String[] args) {
        /* Tv 클래스로부터 인스턴스를 생성하는 방법!
        클래스명 변수명;       클래스의 객체를 참조하기 위한 참조변수를 선언, 인스턴스를 다루기 위해서는 참조변수가 반드시 필요하다!
        변수명 = new 클래스명; 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
        ex)
        Tv t;              Tv클래스 타입의 참조변수 t를 선언
        t= new Tv();       Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장 */

        Tv t;
        t = new Tv();
        t.channel = 7;   // Tv인스턴스의 '멤버변수' channel의 값을 7로 한다.
        t.channelUp(); // Tv인스턴스의 '메서드' channelDown()을 호출한다.
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}

class Tv {  // a.k.a Tv 설계도
    // Tv의 속성 (멤버변수)
    String color;  // 색상
    boolean power; // 전원상태(on/off)
    int channel;   // 채널

    // Tv의 기능 (메서드)
    void power() { power = !power; }
    void channelUp()  { ++channel; }
    void channelDown() { --channel;}
}

/*
인스턴스의 멤버변수 (속성)을 사용하려면 '참조변수.멤버변수'와 같이 하면 된다.
ex) t.channel
 */
