package Object.Cinema;

public class SequenceCondition implements DiscountCondition {
    private int sequence; // 할인 여부를 위해 판단하기 위해 사용할 순번(sequence)을 인스턴스 변수로 포함

    public SequenceCondition(int sequence){
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
        // 파라미터로 전달된 Screening의 상영 순번과 일치할 경우 할인 가능한 것으로 판단해서 true 반환
    }
}
