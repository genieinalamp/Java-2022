package JavaExercise;
/* 생성자에서 다른 생성자 호출하기: this()
1) 생성자의 이름으로 클래스이름 대신 this를 사용한다.
2) 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출 가능.
 */

class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4); // 첫 줄
    }

    Car2(String color) {
        this(color, "auto", 4);        // 첫 줄
    }

    Car2(String color, String gearType, int door) {
        this.color = color;  // 생성자의 매개변수로 선언된 변수의 이름이 인스턴스 변수와 같은 경우에 '인스턴스 변수' 앞에 this를 사용한다.
        this.gearType = gearType;
        this.door = door;
    }
}
public class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door=" + c2.door);
    }
}
