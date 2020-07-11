package mario_game.model;

public class KirbyCharacterReceiver {
    private String name;

    public KirbyCharacterReceiver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void moveUp() {
        System.out.println("Kirby moving up..");
    }

    public void moveDown() {
        System.out.println("Kirby moving down..");
    }

    public void moveLeft() {
        System.out.println("Kirby moving left..");
    }

    public void moveRight() {
        System.out.println("Kirby moving right..");
    }
}
