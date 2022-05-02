package JavaExercise;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L); // double 대신 long 값으로 호출하였지만 이 값은 double로 자동형변환 된다!

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
        System.out.println();

        Gugudan gugu = new Gugudan();
        gugu.print99danAll();
//      구구단 출력하기 성공!

    }
}

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
//        return a + b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
    }
    long subtract(long a, long b) { return a - b; }
    long multiply(long a, long b) { return a * b; }
    double divide(double a, double b) { return a / b; }
}

class Gugudan {
    void print99danAll() {
        for(int i=1;i<=9;i++) {
            for(int j=2;j<=9;j++) {
                System.out.print(j+"*"+i+"="+(j*i)+" ");
            }
            System.out.println();
        }
        return;
        /*반환타입이 void이므로 생략가능. 컴파일러가 자동추가
          반환값이 있는 경우, 반드시 return문이 있어야 한다. 없으면 컴파일 에러발생 (error: missing return statement)
         */
    }
}