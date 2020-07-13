package games;

import games.model.EndlessRunner;
import games.model.Football;
import games.model.Game;

public class Main {
    public static void main(String[] args) {
        Game game1 = new Football();
        game1.play();
        System.out.println("==================");

        Game game2 = new EndlessRunner();
        game2.play();
        System.out.println("==================");
    }
}
