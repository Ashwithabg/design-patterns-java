package score_board;

import score_board.controller.ScoreBoard;
import score_board.model.Balloon;
import score_board.model.Clown;
import score_board.model.SquareBalloon;

public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.println("balloon tap score");
        scoreBoard.base = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.println("clown tap score");
        scoreBoard.base = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.println("square balloon taps score");
        scoreBoard.base = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}
