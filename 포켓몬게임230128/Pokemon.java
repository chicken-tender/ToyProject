package 포켓몬게임230128;

public abstract class Pokemon {
    private final static int MIN_HP = 0;
    protected String name;
    protected String village;
    protected int power;
    protected int defensive;
    protected int HP;
    protected int EXP;

    public Pokemon(String name, String village, int power, int defensive, int HP, int EXP) {
        this.name = name;
        this.village = village;
        this.power = power;
        this.defensive = defensive;
        this.HP = HP;
        this.EXP = EXP;
    }
    public void evolve(){};

    public void pvp(Pokemon pokemon) {
        currentHpView(pokemon);
        while (HP > MIN_HP && pokemon.HP > MIN_HP) {
            fighting(pokemon);
        }
        HP = 45;
        pokemon.HP = 39;
    }
    public void currentHpView(Pokemon pokemon) {
        System.out.println("========= " + name + " VS " + pokemon.name + " =========");
        System.out.println(pokemon.name + " HP : " + pokemon.HP);
        System.out.println(name + " HP : " + HP);
        System.out.println("====================================");
        System.out.println();
    }

    public void fighting(Pokemon pokemon) {
        System.out.println(name + " 이(가) " + pokemon.name + " 을(를) 공격합니다.");
        pokemon.HP -= (power - pokemon.defensive);
        if(pokemon.HP < MIN_HP) {
            pokemon.HP = 0;
            System.out.println(pokemon.name + "의 HP가 0이 되어 PVP가 종료됩니다.");
            EXP += 10;
            System.out.println(name + " 경험치가 " + EXP + " 으(로) 변경되었습니다.");
            return;
        }
        currentHpView(pokemon);
        System.out.println(pokemon.name + " 이(가) " + name + " 을(를) 공격합니다.");
        HP -= (pokemon.power - defensive);
        if(pokemon.HP < MIN_HP) {
            pokemon.HP = 0;
            System.out.println(name + "의 HP가 0이 되어 PVP가 종료됩니다.");
            pokemon.EXP += 10;
            System.out.println(pokemon.name + " 경험치가 " + pokemon.EXP + " 으(로) 변경되었습니다.");
            return;
        }
        currentHpView(pokemon);
    }

    public void pickUpFight(Pokemon pokemon) {
        System.out.println(name + " 이(가) " + pokemon.name + " 에게 PVP를 신청 합니다.");
        System.out.println();
    }

    public void infoView() {
        System.out.println("====== " + name + " 정보 ======");
        System.out.println("마을 : " + village);
        System.out.println("경험치 : " + EXP);
        System.out.println("HP : " + HP);
        System.out.println("공격 : " + power);
        System.out.println("방어 : " + defensive);
    }

    public void create() {
        System.out.println(name + " 이(가) " + village + " 마을에서 생성되었습니다.");
        System.out.println();
    }
}
