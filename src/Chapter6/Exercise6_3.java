package Chapter6;

public class Exercise6_3 {
    public static void main(String[] args) {

//        연습문제 6-1에서 정의한 Student 클래스에 다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage()를 추가하시오.

        Student s = new Student();
        s.name = "이몽구";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:" + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
    }
}

class Student { // 연습문제 6-1 Student클래스 정의하기.

    String name; // 타입 + 변수명, 학생이름
    int ban;     // 반
    int no;      // 번호
    int kor;     // 국어점수
    int eng;     // 영어점수
    int math;    // 수학점수

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {

        return Math.round(getTotal()*10/3.0)/10f;
    }
}
/*  Math.round 가장 가까운 int값을 찾는다 (소수면 반올림)
    int getTotal;
    메서드명: getTotal
    기능: 국어 영어 수학의 점수를 모두 더해서 반환한다.
    반환타입: int
    매개변수: 없음

    int getAverage;
    기능: 총점을 과목수로 나눈 평균을 구한다.
         소수점 둘째자리에서 반올림할 것.
    반환타입: float
    매개변수: 없음
*/
