package EasyJava.ch04.MyPrinter;

public class PrinterTest {
    public static void main(String[] args) {
        /*
        Printer 객체를 생성한다.
        프린터에 용지 100장을 추가한다.
        프린터로 70장을 출력한다.
        프린터에 남아 있는 용지를 조사한다.
         */
        // printer 클래스를 테스트하는 코드

        Printer p = new Printer(10);
        p.print(2);
        p.print(20);
        p.print(10);
    }
}
