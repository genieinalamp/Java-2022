package JavaExercise;

public class Chapter2 {
    public static void main(String args[]){
//      연습문제 풀어보기 2-7
        System.out.println("1" + "2");  // 12(문자)
        System.out.println(true + "");  // true(문자)
        System.out.println('A' + 'B');  // 131 오류날 줄 알았는데 아스키코드 65,66으로 계산 됨... 무친!
        System.out.println('1' + 2);    // 51 아스키코드 0-9: 48-67 49+2=51
        System.out.println('1' + '2');  // 49+50=99
        System.out.println('J' + "ava");// Java
//        System.out.println(true + null);//오류 남 (bad operand types for binary operator '+')


//      연습문제 풀어보기 2-8
        int x = 1;
        int y = 2;
        int z = 3;

        int tmp = x;
        x = y;
        y = z;
        z = tmp;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);

    }
}
