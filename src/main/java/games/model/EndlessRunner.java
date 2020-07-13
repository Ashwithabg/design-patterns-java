package games.model;

public class EndlessRunner extends Game {

    @Override
    void initialize() {
        System.out.println("initializing end less runner game");
    }

    @Override
    void startPlay() {
        System.out.println("endless runner starting");
    }

    @Override
    void endPlay() {
        System.out.println("endless runner ending");
    }
}
