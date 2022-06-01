package Chapter6;
class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance2(int a, int b) {
            return Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
    }

}
public class Exercise6_6 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        // p와 (2,2)의 거리를 구한다.
        System.out.println(p.getDistance2(2,2));
    }

}
