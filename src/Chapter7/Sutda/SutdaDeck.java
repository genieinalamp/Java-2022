package Chapter7.Sutda;
/*
섯다카드 20장을 포함하는 섯다카드 한 벌(섯다댘)을 정의한 것이다. 섯다카드 20장을 담는 섯다카드 배열을 초기화하시오.
단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광이어야 한다.
즉, 섯다카드의 인스턴스 변수 isKwang 의 값이 true이어야 한다.
 */

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){ // 생성자
//         배열 섯다카드를 적절히 초기화하시오.
        for (int i=0; i<cards.length; i++) {
            boolean isKwang = false;
            int num = (i%10) + 1;
            if (i<10 && (num==1|num==3|num==8)){
                isKwang = true;
            } // end of if
            cards[i] = new SutdaCard (num, isKwang);
        } // end of for
    } // SutdaDeck

    void shuffle(){
        // 배열 cards에 담긴 카드의 위치를 뒤섞는 메서드 - Math.random() 사용
        for (int i=0; i<cards.length; i++){
            int j = (int)(Math.random() * cards.length);

            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
            // i와 j의 값을 서로 바꾼다!
        }
    }

    SutdaCard pick( int index ) {
        // 배열 cards에서 지정된 위치(int index)의 StutdaCard를 반환하는 메서드 0~19
        if (index < 0 || index >= CARD_NUM) // index 유효성 검사
            return null;

        return cards[index];
    }

    SutdaCard pick (){
        // 배열 cards에서 임의의 위치의 SutdaCard를 반환하는 메서드 0-19
        int i = (int)(Math.random() * cards.length);
        return pick(i);
    }

}
