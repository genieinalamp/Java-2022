package Chapter7;
// 컴파일하면 에러가 발생하는 이유와 에러를 수정하기 위해 코드를 어떻게 바꾸어야 하는지를 설명하라

public class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}

class Product{
    int price;      // 제품 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product(int price){
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
    Product(){} // 기본 생성자가 자동으로 추가되지 않기 때문에 직접 생성해야 함.
}

class Tv extends Product{
    Tv(){
        //super(100);
    }
    public String toString(){
        return "Tv";
    }
}
