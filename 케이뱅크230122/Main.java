package 케이뱅크230122;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountProduct ac = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("상품 선택 [1]자유적금 [2]챌린지박스 [3]예금 : ");
        int sel = sc.nextInt();
        switch(sel) {
            case 1 : ac = new FreeSaving("양콩미"); break;
            case 2 : ac = new ChallengeSaving("양콩미"); break;
            case 3 : ac = new Deposit("양콩미"); break;
            default : System.out.println("상품을 잘못 선택하셨습니다.");
        }
        System.out.print("납입 금액 : ");
        int money = sc.nextInt();
        System.out.print("가입 기간 : ");
        int period = sc.nextInt();

        if(sel == 1 || sel == 2) ac.realRate(period);
        ac.basicInterest(money,period);
        ac.realInterest(money,period);
        DecimalFormat formatter = new DecimalFormat("#,##0");
        String maturityAmount = formatter.format(ac.maturityAmount());
        String realMaturityAmount = formatter.format(ac.realMaturityAmount());

        System.out.println("====== " + ac.getName() + " 님의 상품 가입 정보 ======");
        System.out.printf("금리 : %.2f%s\n",(ac.rate * 100),"%");
        System.out.printf("가입기간 : %d개월\n", ac.period);
        System.out.println("만기금액(세전) : " + maturityAmount + "원");
        System.out.println("만기금액(세후) : " + realMaturityAmount + "원");
    }
}