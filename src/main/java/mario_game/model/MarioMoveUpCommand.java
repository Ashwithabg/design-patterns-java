package mario_game.model;

import mario_game.Command;

public class MarioMoveUpCommand implements Command {
    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioMoveUpCommand(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveUp();
    }
}
