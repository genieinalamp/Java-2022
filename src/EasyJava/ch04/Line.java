package EasyJava.ch04;

public class Line { // 길이 속성만 가진 직선
    int width;
    Line (int width) {
        this.width = width;
    }

    boolean isSameLine ( Line x ) {
        if ( width == x.width ) {
            return true;
        } else return false;

    }

}
