package JavaExercise;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1. width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2. width + ", " + c2.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1. width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2. width + ", " + c2.height + ")");
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

/* 객체배열
Tv[] tvArr = new Tv[3]; 길이가 3인 Tv타입의 참조변수 배열 생성. 이 객체 배열은 3개의 '객체의 주소'를 저장할 수 있다.
tvArr[0] = new Tv();
tvArr[1] = new Tv();
tvArr[2] = new Tv();  *객체를 생성해서 배열의 각 요소에 저장! 잊으면 안 됨!
배열의 초기화 블록을 사용하면, 위의 세 줄을 한 줄로 간단히 할 수 있다.
Tv[] tvArr = { new Tv(), new Tv(), new Tv() };

**객체의 수가 많을 때는 for문 사용도 가능 ㅇㅇ
Tv[] tvArr = new Tv[100];

for (int i=0; i<tvArr.length; i++) {
      tvArr[i] = new Tv();
}
 */