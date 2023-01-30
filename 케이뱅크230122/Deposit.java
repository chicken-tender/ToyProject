package 케이뱅크230122;

public class Deposit extends AccountProduct {
    protected int payment; // 납입 금액

    Deposit(String name){
        this.name = name;
        rate = 0.045;
    }
    // 세전 이자 금액
    @Override
    public int basicInterest(int payment, int period) {
        this.payment = payment;
        this.period = period;
        interestMoney = (int)(payment * rate) * period / 12;
        return interestMoney;
    }
    // 만기 금액(세전)
    @Override
    public int maturityAmount() {
        maturityAmount = payment + interestMoney;
        return maturityAmount;
    }
    // 세후 이자 금액
    @Override
    public int realInterest(int monthPayment, int period) {
        realInterestMoney = interestMoney - (int)(interestMoney * 0.154);
        return realInterestMoney;
    }
    // 만기 금액(세후)
    @Override
    public int realMaturityAmount() {
        realMaturityAmount = payment + realInterestMoney;
        return realMaturityAmount;
    }
}