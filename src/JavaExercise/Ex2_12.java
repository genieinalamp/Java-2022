package JavaExercise;
/* 타입 간의 변환방법 p.66
1. 숫자를 문자로 변환 - 숫자에 '0'을 더한다.
 (char)(3 + '0' ) -> 3

2. 문자를 숫자로 변환 - 문자에서 '0'을 뺀다.
 '3' - '0' -> 3

3. 숫자를 문자열로 변환 - 숫자에 빈 문자열("")을 더한다.
 3 + "" -> "3"

4. 문자열을 숫자로 변환 - Integer.parseInt() 또는 Double.parseDouble()을 사용한다.
 Integer.parseInt("3") -> 3
 Double.parseDouble("3.14) -> 3.14

5. 문자열을 문자로 변환 - charAt(0)을 사용한다.
 "3".charAt(0) -> '3'

6. 문자를 문자열로 변환 - 빈 문자열("")을 더한다.
 '3' + "" -> "3"
 */

public class Ex2_12{
    public static void main(String []args){
        String str = "3";

        System.out.println(str.charAt(0) - '0'); // 문자열을 문자로 변환하고 숫자로 변환
        System.out.println('3' - '0' + 1); // 숫자 3+1 = 4
        System.out.println(Integer.parseInt("3") + 1); // 문자열을 숫자로 변환 후 +1
        System.out.println("3" + 1);
        System.out.println((char)(3 + '0'));
    }
}
