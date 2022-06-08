package EasyJava.ch06;
public class Animal {
    public Animal(String s) {
        System.out.println("동물 : " + s );

    }
}

class Mammal extends Animal {
    public Mammal() {
        // super();
        super("원숭이");
        System.out.println("포유류 : 원숭이");
    }

        public Mammal(String s) {
            super(s);
            System.out.println("포유류 : " + s);
        }
    }

