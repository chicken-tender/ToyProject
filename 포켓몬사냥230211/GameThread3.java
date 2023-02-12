package 포켓몬사냥230211;

public class GameThread3 extends Thread {
    private Pokemon pikachu;
    private Pokemon squirtle;
    private Pokemon pantom;

    public GameThread3(Pokemon pikachu, Pokemon squirtle, Pokemon pantom) {
        this.pikachu = pikachu;
        this.squirtle = squirtle;
        this.pantom = pantom;
    }

    @Override
    public void run() {
        int normal;
        int special;

        while(true) {
            try {
                sleep(2000);
                normal = (int)(Math.random() * 2);
                special = (int)(Math.random() * 20);

                if(normal == 0) {
                    if(pikachu.isDead == true) {
                        System.out.println("## [" + pantom.name + "] [공격] 성공!! ## " + squirtle.name + "에게 " + pantom.pAttack() + " 데미지를 입혔습니다.");
                        squirtle.isDead = squirtle.setDamage(pantom.pAttack());
                    } else {
                        System.out.println("## [" + pantom.name + "] [공격] 성공!! ## " + pikachu.name + "에게 " + pantom.pAttack() + " 데미지를 입혔습니다.");
                        pikachu.isDead = pikachu.setDamage(pantom.pAttack());
                    }
                }
                if(normal == 1) {
                    if(squirtle.isDead == true) {
                        System.out.println("## [" + pantom.name + "] [공격] 성공!! ## " + pikachu.name + "에게 " + pantom.pAttack() + " 데미지를 입혔습니다.");
                        pikachu.isDead = pikachu.setDamage(pantom.pAttack());
                    }
                    else {
                        System.out.println("## [" + pantom.name + "] [공격] 성공!! ## " + squirtle.name + "에게 " + pantom.pAttack() + " 데미지를 입혔습니다.");
                        squirtle.isDead = squirtle.setDamage(pantom.pAttack());
                    }
                }
                if(special == 1) {
                    if(pikachu.isDead == true) {
                        System.out.println("## [" + pantom.name + "] [필살기] 발동!! ## " + squirtle.name + "에게 " + pantom.specialPower() + " 데미지를 입혔습니다.");
                        squirtle.isDead = squirtle.setDamage(pantom.specialPower());
                    } else {
                        System.out.println("## [" + pantom.name + "] [필살기] 발동!! ## " + pikachu.name + "에게 " + pantom.specialPower() + " 데미지를 입혔습니다.");
                        pikachu.isDead = pikachu.setDamage(pantom.specialPower());
                    }
                }
                if(special == 2) {
                    if(squirtle.isDead == true) {
                        System.out.println("## [" + pantom.name + "] [필살기] 발동!! ## " + pikachu.name + "에게 " + pantom.specialPower() + " 데미지를 입혔습니다.");
                        pikachu.isDead = pikachu.setDamage(pantom.specialPower());
                    } else {
                        System.out.println("## [" + pantom.name + "] [필살기] 발동!! ## " + squirtle.name + "에게 " + pantom.specialPower() + " 데미지를 입혔습니다.");
                        squirtle.isDead = squirtle.setDamage(pantom.specialPower());
                    }
                }
                if(pikachu.isDead && squirtle.isDead) System.exit(0);
            } catch (InterruptedException e) {}
        }
    }
}
