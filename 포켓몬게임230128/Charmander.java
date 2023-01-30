package 포켓몬게임230128;

public class Charmander extends Pokemon {
    public Charmander() {
        super("파이리", "관동", 52, 30, 39, 0);
    }

    @Override
    public void evolve() {
        if(EXP == 10) {
            name = "리자드";
            EXP = 0;
            power += 25;
            defensive += 14;
            HP += 23;
            System.out.println("진화에 성공하였습니다. " + name + " 이(가) 되었습니다.");
            System.out.println();
        }
    }
}
