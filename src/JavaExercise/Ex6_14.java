package JavaExercise;
/* 6-40 멤버변수의 초기화 예제1
변수의 초기화 방법
지역변수는 사용하기 전 반드시 초기화
멤버변수(클래스변수cv, 인스턴스변수iv)는 각 타입의 기본값으로 자동 초기화 됨!
순서: 자동 초기화 > 명시적 초기화(간단초기화) > 초기화 블럭 {initialization block} > 생성자
 */
public class Ex6_14 {
    static {
        System.out.println("static { }"); // 클래스 초기화 블럭 static {}
    }

    {
        System.out.println("{ }");        // 인스턴스 초기화 블럭 {}
    }

    public Ex6_14() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("Ex_14 bt = new Ex6_14(); ");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
        Ex6_14 bt2 = new Ex6_14();
    }
}
