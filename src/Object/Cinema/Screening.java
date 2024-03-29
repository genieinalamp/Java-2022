package Object.Cinema;

import java.time.LocalDateTime;

public class Screening { // 상영 : 영화(movie)는 여러 번 상영될 수 있고 상영은 여러 번 예매 될 수 있음
    private Movie movie; // 상영할 영화
    private int sequence;// 순번
    private LocalDateTime whenScreened; // 상영 시작 시간

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) { // 생성자
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() { // 상영 시작 시간을 반환하는 메서드
        return whenScreened;
    }

    public boolean isSequence(int sequence) { // 순번의 일치 여부를 검사하는 메서드
        return this.sequence == sequence;
    }

    public Money getMovieFee() { // 기본 요금을 반환하는 메서드
        return movie.getFee();
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        // 영화를 예매한 후 예매 정보를 담고있는 Reservation 의 인스턴스를 생성해서 반환함
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) { // 요금을 계산한 후 그 결과를 Reservation 생성자에 전달
        return movie.calculateMovieFee(this).times(audienceCount);
    }

}
