package 포켓몬사냥230211;

public class GameThread2 extends Thread {
    private Pikachu pikachu;
    private Squirtle squirtle;
    private Pantom pantom;

    public GameThread2(Pikachu pikachu, Squirtle squirtle, Pantom pantom) {
        this.pikachu = pikachu;
        this.squirtle = squirtle;
        this.pantom = pantom;
    }


    @Override
    public void run() {
        int normal = (int)(Math.random() * 2);
        int special = (int)(Math.random() * 10);

        while(squirtle.isDead == false) {
            try {
                sleep(2000);
                if(normal == 0) {
                    System.out.println("## [" + squirtle.name + "] [공격] 성공!! ## " + squirtle.pAttack() + " 데미지를 입혔습니다.");
                    pantom.isDead = pantom.setDamage(squirtle.pAttack());
                }
                if(special == 2) {
                    System.out.println("## [" + squirtle.name + "] [필살기] 발동!! ## " + squirtle.specialPower() + " 데미지를 입혔습니다.");
                    pantom.isDead = pantom.setDamage(squirtle.specialPower());
                }
                if(pantom.isDead) System.exit(0);
            } catch (InterruptedException e) {}
        }
    }
}
