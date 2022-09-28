package Chapter7;

class Outer2{
    int value = 10;

    class Inner{
        int value = 20;
        void method1(){
            int value = 30;

            System.out.println(value);
            System.out.println(Outer2.Inner.this.value);
            System.out.println(Outer2.this.value);
        }
    } // end of Inner
} // end of Outer2

public class Exercise7_8 {
    public static void main(String[] args) {
        Outer2 o2 = new Outer2();
        Outer2.Inner inner = o2.new Inner();
        inner.method1();
    }
}