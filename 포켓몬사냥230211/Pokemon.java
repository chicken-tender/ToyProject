package 포켓몬사냥230211;

public class Pokemon extends Unit implements Action {

    public Pokemon(String name, int hp, int p, double pHit, int specialP, boolean isDead) {
        this.name = name;
        this.hp = hp;
        this.power = p;
        this.pHit = pHit;
        this.specialPower = specialP;
        this.isDead = isDead;
    }

    public int pAttack() {
        return (int)(power * pHit);
    }

    public int specialPower() {
        return specialPower;
    }

    public boolean setDamage(double damage) {
        if(hp > damage) {
            hp -= damage;
            System.out.println("[" + name + "] 현재 체력 : " + hp);
            return false;
        } else {
            System.err.println("[" + name + "] DEAD!!");
            return true;
        }
    }
}
