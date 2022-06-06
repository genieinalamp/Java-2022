package EasyJava.ch04.Triangle;

public class Triangle {
    private double width;
    private double height;
    //String triangle;

    Triangle (double w, double h){ // 생성자
        setWidth(w);
        setHeight(h);
    }
    public double getWidth() { // 접근자
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth( double w ) { // 설정자
        this.width = w;
    }
    public void setHeight ( double h ) {
        this.height = h;
    }

    double findArea() { // 삼각형 넓이 구하는 메서드
        return 0.5 * width* height;
    }

    double findArea(Triangle t) {
        return 0.5 * width * height;
    } // end findArea method

    boolean isSameArea(Triangle c) { // 삼각형 넓이가 동일한지 비교하는 메서드
        boolean result = true;
        if (findArea() == c.findArea(c) ) {
            result = true;
            } else if ( findArea() != c.findArea(c) ) {
            result = false;
        }
    return result;
    } // end of findArea method

} // end of class
