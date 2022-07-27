package homework;

public class Game {

    String genre;
    int ageLimit;

    public Game(String genre, int ageLimit){
        this.genre = genre;
        this.ageLimit = ageLimit;
    }

    public Game(){
        genre = "Action";
        ageLimit = 18;
    }

    void installGame(){
        System.out.println("Игра установлена!");
    }

    void deleteGame(){
        System.out.println("Игра удалена :(");
    }

    //Переполнение int
    void overflowInt(){
        int a = 1_000_000_000;
        int b = 2_000_000_000;
        int x = a + b;
        System.out.println(x);
    }

    //Математические операции с разными типами данных
    void differentType(){
        int a = 13;
        double b = 2.045;
        double x = a + b;
        double y = a/b;
        double z = a*b;
        System.out.println(x + " " + y + " " + z);
    }
}
