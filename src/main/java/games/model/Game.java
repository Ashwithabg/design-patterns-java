package games.model;

public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        loadAssets();
        initialize();
        startPlay();
        if (playerWantsNewCharacter()) {
            addNewCharacter();
        }
        endPlay();
    }

    protected abstract void addNewCharacter();

    void loadAssets() {
        System.out.println("loading assets");
    }

    boolean playerWantsNewCharacter() {
        return true;
    }

}
