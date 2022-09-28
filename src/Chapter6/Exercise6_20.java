package Chapter6;

public class Exercise6_20 {

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0)
            return -999999;

        int max = arr[0]; // 배열의 첫번째 값으로 최대값 초기화!
        for (int i = 1; i < arr.length; i++) { // 배열의 두번째 값부터 비교
            if (arr[i] > max)
                max = arr[i];
            }

            return max;
        }
    /*
    max메서드 작성
    주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
    만일 주어진 배열이 null이거나 크기가 0인경우, -999999를 반환한다.
    반환타입 int / 매개변수 int[]arr - 최대값을 구할 배열
     */

        public static void main (String[]args){
            int[] data = {3, 2, 9, 4, 7};
            System.out.println(java.util.Arrays.toString(data));
            System.out.println("최대값:" + max(data));
            System.out.println("최대값:" + max(null));
            System.out.println("최대값:" + max(new int[]{})); // 크기가 0인 배열
        }
    }
