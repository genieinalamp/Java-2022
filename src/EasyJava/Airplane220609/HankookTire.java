package EasyJava.Airplane220609;

public class HankookTire extends Tire {
    // 필드 : 부모 필드 활용
    // 생성자
    public HankookTire ( String location, int maxRotation ) {
        super (location, maxRotation);
    }
    // 메서드 오버라이딩
    @Override
    public boolean roll() {
        ++accRotation; // 누적 회전수 1씩 증가
        if (accRotation < maxRotation) {
            System.out.println(location + " 한국 타이어 수명: " + (maxRotation-accRotation) + "마일리지");
            return true; // 주행 가능
        } else {
            System.out.println("***** 경고: " + location + "한국 타이어 펑크 *****");
            return false; // 주행 불가능
        }
    }
}
