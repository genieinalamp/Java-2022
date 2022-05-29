package Project2022;

import java.util.Scanner;

public class GasStation {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다. ");
            return false;
        }
        return true;
    } // gas 잔량 유무를 판단하여 리턴

    void run() {
        while (true) {
            for (int i = gas; i >= 0; i--) {
                if (gas > 3) {
                    System.out.println("달립니다! gas잔량은 " + gas + "입니다!");
                    gas--;
                }
                else if (gas == 3) {
                    System.out.println("gas가 " + gas + "남았습니다. ");
                    System.out.println("주유소로 갈까요? ");
                    System.out.print("1. 네  / 2. 아니오   >>  ");
                    Scanner scan = new Scanner(System.in);
                    int answer = scan.nextInt();
                    switch (answer) {
                        case 1:
                            System.out.println("주유소 입장!");
                            System.out.print("얼마나 충전할까요?  >> ");
                            int amount = scan.nextInt();
                            gas += amount;
                            System.out.println("gas를 충전했습니다.");
                            System.out.println("현재 gas 잔량은 " + gas + "입니다. ");
                            break;
                        case 2:
                            System.out.println("gas 잔량이 0이 되면 자동차가 고장납니다.");
                            System.out.println("주행을 다시 시작합니다. ");
                            System.out.println("달립니다! gas잔량은 " + gas + "입니다!");
                            gas--;
                            break;
                    }

                } else{
                    do {
                        System.out.println("달립니다! gas잔량은 " + gas + "입니다!");
                        gas--;
                    } while (gas >= 0);
                    return;
                } // end of else
            } // end of for
        } // end of while

    } // end of run
} // end of class

