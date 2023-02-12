package 포켓몬사냥230211;

public class GameThread1 extends Thread{
    private Pokemon pikachu;
    private Pokemon squirtle;
    private Pokemon pantom;

    public GameThread1(Pokemon pikachu, Pokemon squirtle, Pokemon pantom) {
        this.pikachu = pikachu;
        this.squirtle = squirtle;
        this.pantom = pantom;
    }

    @Override
    public void run() {
        int normal = (int)(Math.random() * 2);
        int special = (int)(Math.random() * 10);

        while(pikachu.isDead == false) {
            try {
                sleep(2000);
                if(normal == 0) {
                    System.out.println("## [" + pikachu.name + "] [공격] 성공!! ## " + pikachu.pAttack() + " 데미지를 입혔습니다.");
                    pantom.isDead = pantom.setDamage(pikachu.pAttack());

                }
                if(special == 1) {
                    System.out.println("## [" + pikachu.name + "] [필살기] 발동!! ## " + pikachu.specialPower() + " 데미지를 입혔습니다.");
                    pantom.isDead = pantom.setDamage(pikachu.specialPower());
                }
                if(pantom.isDead) System.exit(0);
            } catch (InterruptedException e) {}
        }
    }
}
