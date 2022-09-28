package Chapter7;

class Outer1{
    static class Inner {
        int iv = 200;
    }
}
public class Exercise7_7 {
    public static void main(String[] args) {
        Outer1.Inner i = new Outer1.Inner();
        System.out.println(i.iv);
    }
}
