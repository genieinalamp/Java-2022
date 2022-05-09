package JavaExercise;

public class Exercise6_2 {
    public static void main(String[] args) {
        Student1 s = new Student1("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);

    }
}
// 생성자와 info()를 추가하시오!
class Student1 {
    String name = "홍길동";
    int a = 1;
    int b = 1;
    int c = 100;
    int d = 60;
    int e = 76;

    String info() {
        System.out.print(name);
        System.out.print(a);
        System.out.print(b);

        String result = name;
        return result;
    }

    Student1(String name, int a, int b, int c, int d, int e) {
//        name = "홍길동";
//        a = 1;
//        b = 1;
//        c = 100;
//        d = 60;
//        e = 76;
    }
}


