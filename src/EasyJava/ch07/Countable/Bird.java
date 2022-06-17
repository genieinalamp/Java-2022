package EasyJava.ch07.Countable;

public class Bird implements Countable {

    String name;

    public Bird(String name){ // name을 초기화하는 코드 채우기
        this.name = name;
    }
    public void fly(){


    }
    @Override
    public void count() { // 상속받은 메서드
        System.out.println(name + "가 2마리 있다.");

    }
}
