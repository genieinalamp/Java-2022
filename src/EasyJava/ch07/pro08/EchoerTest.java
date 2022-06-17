package EasyJava.ch07.pro08;

import java.util.Scanner;

public class EchoerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Echoer e = new Echoer() {
            @Override
            void echo() {
                String s;
                s = in.nextLine();
                System.out.println(s);
            }
        };


        e.start();
        e.echo();
        e.stop();
    }
}
