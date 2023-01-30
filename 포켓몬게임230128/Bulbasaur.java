package 포켓몬게임230128;

public class Bulbasaur extends Pokemon {
    public Bulbasaur() {
        super("이상해씨", "관동", 49, 30, 45, 0 );
    }

    @Override
    public void evolve() {
        if(EXP >= 10) {
            name = "이상해풀";
            EXP = 0;
            power += 20;
            defensive += 10;
            HP += 20;
            System.out.println("진화에 성공하였습니다. " + name + " 이(가) 되었습니다.");
            System.out.println();
        }
    }
}
