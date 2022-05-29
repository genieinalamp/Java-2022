package JavaExercise;

public class CompareToExam {
    public static void main (String[] args) { // 문자열 compareTo 메서드
        String a = "abcd";
        String b = "ab";
        String c = "zyxvw";
        String d = "abcd";

        System.out.println(a.compareTo(b)); // 2출력 : 비교대상이 문자열에 포함되어 있는 경우 a.legnth-b.length리턴 4-2
        System.out.println(a.compareTo(c)); // -25출력 : 다른 문자열인 경우 해당 문자의 아스키코드의 차이를 리턴한다.
        System.out.println(b.compareTo(c)); // -25출력
        System.out.println(a.compareTo(d)); // 0출력 : 문자열이 같은 경우 0리턴

    }
}
