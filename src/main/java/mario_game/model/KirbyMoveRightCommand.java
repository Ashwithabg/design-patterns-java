package mario_game.model;

import mario_game.Command;

public class KirbyMoveRightCommand implements Command {
    private final KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyMoveRightCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveRight();
    }
}
