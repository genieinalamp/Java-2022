package EasyJava.ch04;

public class Dice {
    int face;

    int roll () {
        face = (int)( Math.random()*6 )+1;
        return face;
    }
}
