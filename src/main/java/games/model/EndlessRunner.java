package games.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EndlessRunner extends Game {

    @Override
    void initialize() {
        System.out.println("initializing end less runner game");
    }

    @Override
    void startPlay() {
        System.out.println("endless runner starting");
    }

    @Override
    void endPlay() {
        System.out.println("endless runner ending");
    }

    @Override
    protected void addNewCharacter() {
        System.out.println("Adding new character to the game");
    }

    public boolean playerWantsNewCharacter() {
        String answer = getUserInput();
        if (answer.toLowerCase().equals("y")) {
            return true;
        }
        return false;
    }

    private String getUserInput() {
        String answer = "n";

        System.out.println("do you want to add new character? y/n");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("got IO exception");
        }

        return answer;
    }
}
