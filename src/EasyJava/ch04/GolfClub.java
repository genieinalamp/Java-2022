package EasyJava.ch04;

public class GolfClub { // 골프채 모델링하기
    String model;

    GolfClub (){
        this.model = "7번 아이언";
    }

    GolfClub (int num) {
        this.model = num + "번 아이언";
    }

    GolfClub ( String model ) {
        this.model = model;
    }

    void print(){ // print 메서드
        System.out.println(model+"입니다.");
    }





}
