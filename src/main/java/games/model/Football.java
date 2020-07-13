package games.model;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("initializing football game");
    }

    @Override
    void startPlay() {
        System.out.println("football starting");
    }

    @Override
    void endPlay() {
        System.out.println("football ending");
    }

    @Override
    protected void addNewCharacter() {
        System.out.println("new character");
    }

    boolean playerWantsNewCharacter() {
        return true;
    }
}
