package JavaExercise;

class Data { int x; }

public class Ex6_6 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) { // 기본형 매개변수, 메서드가 종료되면 사라짐.
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
/* 1) change메서드가 호출되면서 d.x가 change메서드의 매개변수 x에 복사됨
   2) change메서드에서 x의 값을 1000으로 변경
   3) change메서드가 종료되면서 매개변수 x는 스택에서 제거됨
 */
/*
자바에서는 메서드를 호출할 때 매개변수로 지정한 값을 메서드의 매개변수에 복사해서 넘겨준다.
기본형 매개변수 : 변수의 값을 읽기만 할 수 있다. read only
참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다. read & write !! 인스턴스의 주소가 복사된다 !!
 */