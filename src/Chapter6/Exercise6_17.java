package Chapter6;

public class Exercise6_17 {
    /* 메서드명 shuffle
    기능: 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
    처리한 배열을 반환한다.
    반환타임: int[]
    매개변수: int[]arr - 정수값이 담긴 배열
     */
    public static int[] shuffle(int[] arr) { // shuffle 메서드 생성
        if(arr==null || arr.length==0)
            return arr;
        // 매개변수로 어떤 값이 넘어올지 모르기 때문에 작업을 시작하기 전에 값의 유효성체크는 반드시 해야 한다.
        // 위 코드는 넘겨받은 배열이 null이거나 크기가 0이면 그대로 반환 한다.

        for (int i = 0; i < arr.length; i++) { // 배열 길이만큼 반복
            int n = (int) (Math.random() * arr.length);
            // n = 1부터 배열 길이만큼 랜덤한 정수 ( 1-9 )

            // 중복처리 ( n이 한 번씩만 나와야 함)
            int tmp = arr[i];
            arr[i] = arr[n];
            arr[n] = tmp;
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
