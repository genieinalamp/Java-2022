package JavaExercise;
/*
6-32 생성자 (constructor)
생성자 = 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'
인스턴스 초기화 = 인스턴스변수들을 초기화하는 것
생성자의 조건 2가지: 1) 생성자 이름은 클래스명과 같아야 하며, 2) 리턴 값이 없다 (but, void를 사용하지는 않음)
생성자가 인스턴스를 생성하는 것이 아니다. 단순히 인스턴스변수들의 초기화에 사용되는 메서드일 뿐.
 */

class Data_1 {
    int value;
}
class Data_2 {
    int value;
    Data_2(){}        // 기본 생성자 꼭 생성해주기 (이미 생성자가 있으므로 자동 추가 안 됨)

    Data_2(int x) {   // 매개변수가 있는 생성자
      value = x;
    }
}
public class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(); // compile error 발생!

    }
}
/* Data_1에는 정의되어 있는 생성자가 하나도 없으므로 컴파일러가 기본 생성자를 추가해주었지만,
Data_2에는 이미 생성자 Data_2(int x)가 정의되어 있으므로 기본 생성자가 추가되지 않았음!
-> 기본 생성자가 컴파일러에 의해 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다!!
 */