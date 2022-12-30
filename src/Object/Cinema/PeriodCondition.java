package Object.Cinema;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition{
    // 상영 시간 시간이 특정한 기간 안에 포함되는지 여부를 판단해 할인 여부 결정
    private DayOfWeek dayOfWeek; // 조건에 사용할 요일
    private LocalTime startTime; // 시간 시간
    private LocalTime endTime;   // 종료 시간

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
                endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
    } // 인자로 전달 된 Screening 의 상영 요일이 dayOfWeek 과 같고 상영 시작 시간이 startTime 과 endTime 사이에 있을 경우에 true 반환!
}
