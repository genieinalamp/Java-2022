package JavaExercise;

public class Ex6_10 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3) 결과: "   + mm.add(3, 3));
        System.out.println("mm.add(3L, 3) 결과: "  + mm.add(3L, 3));
        System.out.println("mm.add(3, 3L) 결과: "  + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L, 3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }
}

class MyMath3 {
    int add(int a, int b) {       // 배열의 모든 요소의 합을 결과로 돌려준다.
        System.out.println("int add(int a, int b) - ");
        return a+b;
    }
    long add(int a, long b) {
        System.out.println("long add(int a, int b) - ");
        return a+b;
    }
    long add(long a, int b) {
        System.out.println("long add(long a, long b) - ");
        return a+b;
    }
    long add(long a, long b) {
        System.out.println("long add(long a, long b) - ");
        return a+b;
    }

    int add(int[] a) {
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for(int i=0; i < a.length; i++)
            result += a[i];
        return result;
    }
}
/* 6-30 (메서드)오버로딩 overloading
오버로딩 또는 메서드 오버로딩: 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것 (like 동음이의어)
오버로딩이 성립하기 위한 조건 3가지
1) 메서드 이름이 같아야 함
2) 매개변수의 '개수' 또는 '타입'이 달라야 함
3) 반환 타입은 관계없음
 */