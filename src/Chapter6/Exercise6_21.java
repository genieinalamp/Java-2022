package Chapter6;

public class Exercise6_21 {
    // abs메서드 작성하기 : 주어진 값의 절대값을 반환하는 메서드
    static int abs (int value) {
        if ( value < 0 ) {
            value = -value;
        } else {
            value = value;
        }
        return value;

        // return value >= 0? value : -value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값:" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값:" + abs(value));
    }
}
