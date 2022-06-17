package EasyJava.ch07.pro05;

public abstract class Controller {
    boolean power;
    void show(){
        if (power) {
            System.out.println(getName() + "가 켜졌습니다.");
        } else {
            System.out.println(getName() + "가 꺼졌습니다.");
        }

    }
    abstract String getName();
}
