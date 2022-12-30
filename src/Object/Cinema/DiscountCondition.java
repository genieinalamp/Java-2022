package Object.Cinema;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
    // 할인이 가능한 경우 true를 반환, 할인이 불가능한 경우에는 false를 반환
}
