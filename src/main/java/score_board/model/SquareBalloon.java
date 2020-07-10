package score_board.model;

import score_board.controller.ScoreBoardBase;

public class SquareBalloon extends ScoreBoardBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 40;
    }
}
