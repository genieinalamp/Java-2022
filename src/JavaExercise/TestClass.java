package JavaExercise;

public class TestClass {
    // 6-29 메서드 간의 호출과 참조
    void instanceMethod() {}       // 인스턴스메서드 (객체 생성 후 호출가능)
    static void staticMethod() {}  // static 메서드

    void instanceMethod2() {       // 인스턴스메서드
        instanceMethod();          // 다른 인스턴스메서드를 호출한다
        staticMethod();            // static메서드를 호출한다
    }

    static void staticMethod2() {  // static메서드
//        instanceMethod();        // 에러: 인스턴스메서드를 호출할 수 없다!
        staticMethod();            // static메서드는 호출할 수 있다
    }
} // end of class

class TestClass2 {
    int iv;         // 인스턴스 변수
    static int cv;  // 클래스 변수

    void instanceMethod() {        // 인스턴스메서드
        System.out.println(iv);    // 인스턴스 변수를 사용할 수 있다
        System.out.println(cv);    // 클래스 변수를 사용할 수 있다
    }

    static void staticMethod() {   // static메서드
//        System.out.println(iv);  // 에러: 인스턴스 변수를 사용할 수 없다!
        System.out.println(cv);    // 클래스 변수는 사용할 수 있다
    }
} // end of class
