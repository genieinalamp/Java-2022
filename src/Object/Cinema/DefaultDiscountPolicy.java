package Object.Cinema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy { // 할인 정책은 금액 할인 정책과 비율 할인 정책으로 구분된다.
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(DiscountCondition ... conditions){
        this.conditions = Arrays.asList(conditions);
        // 하나의 할인 정책은 여러 개의 할인 조건을 포함할 수 있다.
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)){
                return getDiscountAmount(screening);
            } // p.52
        }

        return Money.ZERO; // 할인 조건을 만족시키지 못할 경우
    }

    abstract protected Money getDiscountAmount(Screening Screening);
}
