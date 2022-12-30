package Object.Cinema;

public class Reservation {
    private Customer customer;  // 고객
    private Screening Screening;// 상영 정보
    private Money fee;          // 예매 요금
    private int audienceCount;  // 인원 수

    public Reservation(Customer customer, Screening Screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.Screening = Screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
