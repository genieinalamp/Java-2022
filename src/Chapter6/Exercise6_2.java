package Chapter6;

public class Exercise6_2 {
    public static void main(String[] args) {
        Student1 s = new Student1("홍길동", 1, 1, 100, 60, 76);
        String str = s.info();
        System.out.println(str);
    }
}
// 생성자와 info()를 추가하시오!
class Student1 { // 변수초기화 먼저!
    String name; // 학생이름
    int ban;     // 반
    int no;      // 번호
    int kor;     // 국어점수
    int eng;     // 영어점수
    int math;    // 수학점수

    Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info () { // info메서드 - 도입부 : 타입+변수명
        String str = name +", " + ban +", " + no +", " + kor +", " + eng +", " + math +", " + (kor+eng+math) +", " + (kor+eng+math)/3.0;
        return str; // 소수점 부분 다시 보완 ㅜㅜ
    }

}


