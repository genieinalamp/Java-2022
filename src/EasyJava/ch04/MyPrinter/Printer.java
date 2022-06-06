package EasyJava.ch04.MyPrinter;

public class Printer {

    private int numOfPapers = 0;

    Printer(){} // 기본생성자

    Printer( int x ) {
        //생성자 추가
        numOfPapers = x;
    }

    public int getNumOfPapers() { // 접근자 getter
        return numOfPapers;
    }
    public void SetNumOfPapers ( int numOfPapers) { // 설정자 setter
        this.numOfPapers = numOfPapers;
    }

    public void print (int amount) {
        if ( numOfPapers >= amount ) {
            numOfPapers -= amount;
            System.out.println(amount + "장 출력했습니다. 현재" + numOfPapers + "장 남아 있습니다.");
        } else if (numOfPapers < amount ) {
            System.out.println("모두 출력하려면 용지가 " + (amount-numOfPapers) + "매 부족합니다. " + numOfPapers + "장만 출력합니다. ");
            numOfPapers -= numOfPapers;
            amount -= numOfPapers;
            if ( numOfPapers == 0 ) {
                System.out.println("용지가 없습니다. ");

            }
        }
//        return;
    } // end of method print
}


