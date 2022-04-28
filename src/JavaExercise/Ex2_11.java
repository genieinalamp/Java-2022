package JavaExercise;
/* 정수형의 오버플로우 like 티비채널
   최소값에서 1을 빼면 최대값이 되고, 최대값에 1을 더하면 최소값이 된다는 것이다-!
 */
public class Ex2_11 {
    public static void main(String[] args) {
        short sMin = -32768, sMax = 32767;
        char cMin = 0, cMax = 65535; // char타입이라 int 붙여줘야 함

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1= " + (short)(sMin-1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1 = " + (short)(sMax+1));

        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)--cMin);
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax+1 = " + (int)++cMax);



    }
}
