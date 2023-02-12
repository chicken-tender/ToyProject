package 포켓몬사냥230211;

abstract public class Pokemon {
    protected String name;
    protected int hp;
    protected int power;
    protected double pHit;
    protected int specialPower;
    protected boolean isDead;

    public Pokemon(String name, int hp, int p, double pHit, int specialP) {
        this.name = name;
        this.hp = hp;
        this.power = p;
        this.pHit = pHit;
        this.specialPower = specialP;
        isDead = false;
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
