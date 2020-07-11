package mario_game.model;

import mario_game.Command;

public class KirbyMoveDownCommand implements Command {
    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyMoveDownCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveDown();
    }
}
