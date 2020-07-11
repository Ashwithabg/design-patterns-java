package mario_game;

import mario_game.model.*;

public class Main {
    public static void main(String[] args) {
        MarioCharacterReceiver mario = new MarioCharacterReceiver("mario");
        KirbyCharacterReceiver kirby = new KirbyCharacterReceiver("kirby");

        MarioMoveDownCommand marioMoveDownCommand = new MarioMoveDownCommand(mario);
        MarioMoveUpCommand marioMoveUpCommand = new MarioMoveUpCommand(mario);
        MarioMoveLeftCommand marioMoveLeftCommand = new MarioMoveLeftCommand(mario);
        MarioMoveRightCommand marioMoveRightCommand = new MarioMoveRightCommand(mario);

        KirbyMoveDownCommand kirbyMoveDownCommand = new KirbyMoveDownCommand(kirby);
        KirbyMoveUpCommand kirbyMoveUpCommand = new KirbyMoveUpCommand(kirby);
        KirbyMoveLeftCommand kirbyMoveLeftCommand = new KirbyMoveLeftCommand(kirby);
        KirbyMoveRightCommand kirbyMoveRightCommand = new KirbyMoveRightCommand(kirby);

        GameBoy marioGameBoy = new GameBoy(marioMoveUpCommand, marioMoveDownCommand, marioMoveLeftCommand, marioMoveRightCommand);
        GameBoy kirbyGameBoy = new GameBoy(kirbyMoveUpCommand, kirbyMoveDownCommand, kirbyMoveLeftCommand, kirbyMoveRightCommand);

        marioGameBoy.arrowDown();
        kirbyGameBoy.arrowRight();
        kirbyGameBoy.arrowLeft();
        marioGameBoy.arrowUp();

    }
}
