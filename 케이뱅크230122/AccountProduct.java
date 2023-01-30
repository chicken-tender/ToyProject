package 케이뱅크230122;

public class AccountProduct {
    protected double rate; // 금리
    protected int period; // 가입 기간
    protected int payment; // 월 납입 금액
    protected int interestMoney; // 이자 금액
    protected int realInterestMoney; // 세후 이자 금액
    protected int maturityAmount; // 세전 만기 금액
    protected int realMaturityAmount; // 세후 만기 금액
    protected double realRate; // 세후 이자율
    protected String name; // 고객이름

    public String getName() {
        return name;
    }
    // 세전 이자 금액
    public int basicInterest(int monthPayment, int period) {
        this.payment = monthPayment;
        this.period = period;
        int sum = 0;
        for(int i = period; i > 0; i--) {
            interestMoney = (int)(monthPayment * rate) * i / period;
            sum += interestMoney;
        }
        return sum;
    }
    // 만기 금액(세전) 구하기
    public int maturityAmount() {
        maturityAmount = payment * period + basicInterest(payment, period);
        return maturityAmount;
    }
    // 세후 이자 금액 구하기
    public int realInterest(int monthPayment, int period) {
        this.payment = monthPayment;
        this.period = period;
        int sum = 0;
        for(int i = period; i > 0; i--) {
            realInterestMoney = (int)(monthPayment * realRate(period)) * i / period;
            sum += realInterestMoney;
        }
        return sum;
    }
    // 세후 만기 금액 구하기
    public int realMaturityAmount() {
        realMaturityAmount = payment * period + realInterest(payment, period);
        return realMaturityAmount;
    }
    // 적금 실제 이율 구하기
    public double realRate(int period) {
        realRate = (rate * (period + 1) / 24) * (1 - 0.154);
        return realRate;
    }
}
