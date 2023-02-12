package 포켓몬사냥230211;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();
        Pantom pantom = new Pantom();
        GameThread1 gameThread1 = new GameThread1(pikachu, squirtle, pantom);
        GameThread2 gameThread2 = new GameThread2(pikachu, squirtle, pantom);
        GameThread3 gameThread3 = new GameThread3(pikachu, squirtle, pantom);

        gameThread1.start();
        gameThread2.start();
        gameThread3.start();

        System.out.println(pikachu.name + " & " + squirtle.name + " VS " + pantom.name);
    }
}