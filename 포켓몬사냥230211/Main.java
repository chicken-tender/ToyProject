package 포켓몬사냥230211;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("피카츄",120,15,0.7,22,false);
        Pokemon squirtle = new Pokemon("꼬부기",100,8,0.6,18,false);
        Pokemon pantom = new Pokemon("팬텀", 180, 22, 0.6, 50,false);
        GameThread1 gameThread1 = new GameThread1(pikachu, squirtle, pantom);
        GameThread2 gameThread2 = new GameThread2(pikachu, squirtle, pantom);
        GameThread3 gameThread3 = new GameThread3(pikachu, squirtle, pantom);

        gameThread1.start();
        gameThread2.start();
        gameThread3.start();

        System.out.println(pikachu.name + " & " + squirtle.name + " VS " + pantom.name);
    }
}