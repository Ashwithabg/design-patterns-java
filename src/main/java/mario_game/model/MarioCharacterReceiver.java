package mario_game.model;

public class MarioCharacterReceiver {
    private String name;

    public MarioCharacterReceiver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void moveUp() {
        System.out.println("Mario moving up..");
    }

    public void moveDown() {
        System.out.println("Mario moving down..");
    }

    public void moveLeft() {
        System.out.println("Mario moving left..");
    }

    public void moveRight() {
        System.out.println("Mario moving right..");
    }

}
