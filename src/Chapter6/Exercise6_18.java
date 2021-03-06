package Chapter6;

public class Exercise6_18 {

   static boolean isNumber(String str) {
        boolean is = true;
        for (int i = 1; i <= str.length(); i++) {

            if (str.charAt(i) <= 9) {
                is = true;
            } else {
                is =  false;
            }
        }
        return is;
    }

        /* 기능
        주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
        모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
        만일 주어진 문자열이 null 이거나 빈문자열"" 이라면 false를 반환한다.
        *String클래스의 charAt(int i)메서드를 사용하면 문자열의 i번째 문자를 얻을 수 있다.
        */

    public static void main (String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }

}
