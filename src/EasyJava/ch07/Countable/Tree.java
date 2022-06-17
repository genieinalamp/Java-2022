package EasyJava.ch07.Countable;

public class Tree implements Countable {

    String name;

    public Tree(String name){ // name을 초기화하는 코드 채우기
        this.name = name;
    }
    public void ripen(){


    }
    @Override
    public void count() { // 상속받은 메서드

        System.out.println(name + "가 5그루 있다.");
    }
}
