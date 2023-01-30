package 포켓몬게임230128;
import java.util.Scanner;

public class User {

    public Pokemon setPokemon() {
        Pokemon pokemon = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("포켓몬을 선택 하세요.");
        System.out.println("[1]이상해씨 [2]파이리");
        System.out.print(" > ");
        int sel = sc.nextInt();
        switch(sel) {
            case 1 : pokemon = new Bulbasaur(); break;
            case 2 : pokemon = new Charmander(); break;
        }
        return pokemon;
    }
}
