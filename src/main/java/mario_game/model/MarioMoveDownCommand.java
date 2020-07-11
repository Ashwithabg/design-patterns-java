package mario_game.model;

import mario_game.Command;

public class MarioMoveDownCommand implements Command {
    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioMoveDownCommand(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveDown();
    }
}
