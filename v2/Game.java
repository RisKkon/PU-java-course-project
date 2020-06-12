import java.util.Scanner;

public class Game {



    public static void main(String[] args) {

        boolean isGameRunning = true;
        Scanner scanner = new Scanner(System.in);
        GameBoard gameBoard = new GameBoard();
        System.out.println("Въведете име");
        Player player = new Player(scanner.nextLine());
        Dice dice = new Dice();


        while (isGameRunning) {
            int offset = 0;
            gameBoard.displayGameBoard();
            player.displayPlayerCoordinates();
            System.out.println("Натисни 1 за да хвърлиш зар");
            int input = scanner.nextInt();
            if(input == 1) {
                offset = dice.rollDice(2);

            }
            player.setNextPos(offset);
            gameBoard.onLand(player);
            player.displayPlayerCoordinates();

        }



    }


}