package Project2022;

public class GasStationExam {
    public static void main(String[] args) {

        GasStation car = new GasStation();
        car.setGas(10);

        boolean gasState = car.isLeftGas();
        if (gasState) {
            System.out.println("주행을 시작합니다. 부릉부릉");
            car.run();
        } if (car.isLeftGas()) {
            System.out.println("gas가 없습니다. ");
            System.out.println("자동차 고장!!!");
            System.out.println("수리점으로 가세요 ^-^");
        }
    }
}
