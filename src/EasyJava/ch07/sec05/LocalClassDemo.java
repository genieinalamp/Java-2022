package EasyJava.ch07.sec05;

public class LocalClassDemo { // 지역 클래스의 사용
    private String s1 = "외부";
    void method(){
        int x = 1;
        class LocalClass{ // 지역 클래스
            String s2 = "내부";
            String s3 = s1; // 외부클래스의 private멤버도 접근 가능

            public void show() {
                System.out.println("지역클래스");
                // x = 2;
                // x는 method()내부에 선언된 지역 변수이다. 사실상 final이므로 수정불가
            }
        }

        LocalClass lc = new LocalClass();
        System.out.println(lc.s2);
        lc.show();
    } // end of method

    public static void main(String[] args) {
        LocalClassDemo lcd = new LocalClassDemo();
        lcd.method();
    }

}