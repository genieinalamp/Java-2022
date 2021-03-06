package JavaExercise;

public class Ex6_15 {
    static int[] arr = new int[10]; // 길이가 10인 int형 배열생성

    static {
        for(int i=0; i<arr.length; i++) {
            // 1과 10 사이의 임이의 값을 배열 arr에 저장한다.
            arr[i] = (int)(Math.random()*10) + 1;
        }
    } // 클래스 초기화 블럭!!

    public static void main(String[] args) {
        for(int i=0; i<arr.length; i++)
            System.out.println("arr["+i+"] :" + arr[i]);
    }
}

/*
명시적 초기화를 통해 배열을 생성하고, 클래스 초기화 블럭을 이용해서 배열의 각 요소들을 채우도록 함.
배열이나 예외처리가 필요한 초기화에서는 명시적 초기화만으로는 복잡한 초기화 작업을 할 수 없다.
이런 경우에 추가적으로 클래스 초기화 블럭을 사용하도록 한다.
 */
