package 포켓몬게임230128;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        Pokemon p1 = user1.setPokemon();
        p1.create();

        User user2 = new User();
        Pokemon p2 = user2.setPokemon();
        p2.create();

        p1.pickUpFight(p2);
        p1.pvp(p2);
        p1.evolve();
        p1.infoView();
        p2.infoView();
    }
}
