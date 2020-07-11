package mario_game.model;

import mario_game.Command;

public class MarioMoveRightCommand implements Command {
    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioMoveRightCommand(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveRight();
    }
}
