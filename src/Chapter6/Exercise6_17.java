package Chapter6;

public class Exercise6_17 {
    /* 메서드명 shuffle
    기능: 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
    처리한 배열을 반환한다.
    반환타임: int[]
    매개변수: int[]arr - 정수값이 담긴 배열
     */
    static int[] shuffle(int[] arr) { // shuffle 메서드 생성
        for (int i = 0; i < arr.length; i++) { // 배열 길이만큼 반복
            int n = (int) (Math.random() * arr.length) + 1;
            // n = 1부터 배열 길이만큼 랜덤한 정수 ( 1-9 )

            // 중복처리 ( n이 한 번씩만 나와야 함)
            int tmp = arr[n];
            arr[n] = arr[i];
            arr[i] = tmp;
            //return arr;
        } return arr;
    }
        public static void main (String[]args)
        {
            int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println(java.util.Arrays.toString(original));

            int[] result = shuffle(original);
            System.out.println(java.util.Arrays.toString(result));
        }// end of main
}// end of class
