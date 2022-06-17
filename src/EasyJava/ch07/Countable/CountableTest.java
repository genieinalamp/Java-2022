package EasyJava.ch07.Countable;

public class CountableTest {
    public static void main(String[] args) {
        Countable[] m = {new Bird("뻐꾸기"), new Bird("독수리"),
                new Tree("사과나무"), new Tree("밤나무")};

        for (Countable e : m)
            e.count();

        for (int i = 0; i < m.length; i++) {
            // 타입에 따라 fly() 또는 ripen() 메서드를 호출하는 코드
            if (m[i] instanceof Bird) {
                System.out.println("2마리 " + ((Bird) m[i]).name + "가 날아간다.");
            } else if (m[i] instanceof Tree) {
                System.out.println(((Tree) m[i]).name + "에 열매가 잘 익었다.");
            }
        }
    }
}
