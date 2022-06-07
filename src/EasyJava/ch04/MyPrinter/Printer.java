package EasyJava.ch04.MyPrinter;

public class Printer { // 양면 출력이 가능한 프린터로 수정하되 접근자와 설정자도 추가하기!

    private int numOfPapers;
    private static boolean duplex; // 양면 출력 여부를 나타내는 필드

    public Printer( int numOfPapers, boolean duplex ) { // 기본 생성자
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }
//    public int getNumOfPapers() { // 접근자 getter
//        return numOfPapers;
//    }
//    public void SetNumOfPapers ( int numOfPapers) { // 설정자 setter
//        this.numOfPapers = numOfPapers;
//    }
    public void print (int amount) { // 양면 여부에 따라 출력할 수 있도록 수정
        if (duplex == false) { // 단면출력
            if (numOfPapers >= amount) {
                numOfPapers -= amount;
                System.out.println(amount + "장 출력했습니다. 현재" + numOfPapers + "장 남아 있습니다.");
            } else if (numOfPapers < amount) {
                System.out.println("단면으로 모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다. " + numOfPapers + "장만 출력합니다. ");
                numOfPapers -= numOfPapers;
                amount -= numOfPapers;
                if (numOfPapers == 0) {
                    System.out.println("용지가 없습니다. ");
                }
            }

        } else if (duplex == true) { // 양면출력
            if ( amount % 2 == 0) {
                numOfPapers -= (amount/2);
                System.out.println("양면으로 " + (amount/2) + "장 출력했습니다. ");
                System.out.println("현재 " + numOfPapers + "장 남아 있습니다. ");

            } else if ( amount % 2 == 1) {
                numOfPapers -= ((amount/2)+1);
                System.out.println("양면으로 " + ((amount/2)+1) + "장 출력했습니다. ");
                System.out.println("현재 " + numOfPapers + "장 남아 있습니다. ");
            }
        }

    }

    public boolean getDuplex() { // 접근자 생성
        return duplex;
    }
    public void setDuplex(boolean duplex) { // 설정자 생성
        this.duplex = duplex;
    }
}


