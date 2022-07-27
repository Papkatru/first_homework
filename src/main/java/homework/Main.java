package homework;

public class Main {
    public static void main(String[] args) {

        Game one = new Game();
        Game two = new Game("RPG", 13);

        one.installGame();
        two.deleteGame();

        one.overflowInt();
        two.differentType();
    }
}
