package mario_game.model;

import mario_game.Command;

public class KirbyMoveLeftCommand implements Command {
    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyMoveLeftCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveLeft();
    }
}
