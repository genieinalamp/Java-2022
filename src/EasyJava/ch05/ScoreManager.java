package EasyJava.ch05;

import java.util.Scanner;

public class ScoreManager {
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요 : ");
        numOfStudents = in.nextInt();
        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
        scores = new int[numOfStudents];
        for ( int i=0; i< scores.length; i++ ){
            scores[i] = in.nextInt();
            //System.out.println((i+1) + "번째 학생의 점수 : " + scores[i]);
        }
        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다. ");
        //System.out.println(scores[numOfStudents]);
        for ( int i=0; i<scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

    }
}
