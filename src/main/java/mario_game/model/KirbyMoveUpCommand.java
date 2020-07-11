package mario_game.model;

import mario_game.Command;

public class KirbyMoveUpCommand implements Command {
    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyMoveUpCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveUp();
    }
}
