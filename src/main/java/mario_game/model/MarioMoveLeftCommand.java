package mario_game.model;

import mario_game.Command;

public class MarioMoveLeftCommand implements Command {
    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioMoveLeftCommand(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveLeft();
    }
}
