package score_board.controller;

public class ScoreBoard {
    public ScoreBoardBase base;

    public void showScore(int taps, int multiplier) {
        System.out.println(base.calculateScore(taps, multiplier));
    }
}
