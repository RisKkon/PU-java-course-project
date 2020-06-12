import java.util.Scanner;

public class Game {

    


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GameBoard gameBoard = new GameBoard();
        System.out.println("Welcome to the game");
        System.out.println("Enter username");
        Player player = new Player();
        player.userName = scanner.nextLine();


    }


}