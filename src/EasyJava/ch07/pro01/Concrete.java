package EasyJava.ch07.pro01;

public class Concrete extends Abstract {
    int j;

    public Concrete(int i, int j) {
        super();
        System.out.println("i = " + i + ", j = " + j);
    }

    @Override
    void show() {

    }
}
