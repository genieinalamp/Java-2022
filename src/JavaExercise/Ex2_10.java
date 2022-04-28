package JavaExercise;

import java.util.Scanner; // Scanner 클래스를 사용하기 위해 추가

// Chapter2.14 화면으로부터 입력받기
public class Ex2_10{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); // Scanner 클래스의 객체를 생성

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine(); // 입력받은 내용을 input에 저장
        int num = Integer.parseInt(input); // 입력받은 int타입의 값으로 변환 (문자열을 숫자로)
        /* Scanner 클래스에는 nextInt() nextFloat()와 같이 변환없이 숫자를 바로 입력받을 수 있는 메서드들이 있다!
           이 메서드들을 사용하면 문자열을 숫자로 변환하지 않아도 된다-!!
         */

        System.out.println("입력내용 :"+input);
        System.out.printf("num=%d%n", num);
    }
}

