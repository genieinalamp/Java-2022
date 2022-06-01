package Chapter6;
// 6-5 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
public class PlayingCard {
    int kind;                    // 인스턴스 변수
    int num;

    static int width;            // static 변수 (클래스변수)
    static int height;

    PlayingCard(int k, int n) { // 지역변수
        kind = k;
        num = n;
    }

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1); // 매개변수(지역변수)
    }
}
