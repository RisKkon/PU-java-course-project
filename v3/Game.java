import java.util.Scanner;

public class Game {



    public static void main(String[] args) {
        int currentPlayerId = 1;

        boolean isGameRunning = true;
        Scanner scanner = new Scanner(System.in);
        GameBoard gameBoard = new GameBoard();
        System.out.println("Въведете име");
        Player player = new Player(scanner.nextLine());
        Player player1 = new Player("Bot");
        Dice dice = new Dice();


        while (isGameRunning) {
            int offset = 0;
            gameBoard.displayGameBoard();
            currentPlayer(currentPlayerId, player, player1).displayPlayerCoordinates();
            System.out.println("Натисни 1 за да хвърлиш зар");
            int input = scanner.nextInt();
            if(input == 1) {
                offset = dice.rollDice(1);

            }
            currentPlayer(currentPlayerId, player, player1).setNextPos(offset);
            gameBoard.onLand(currentPlayer(currentPlayerId, player, player1));
            currentPlayer(currentPlayerId, player, player1).displayPlayerCoordinates();
            currentPlayerId++;


        }



    }
    public static Player currentPlayer(int currentPlayerId, Player player, Player player1) {


        if(currentPlayerId % 2 != 0) {

            return player;
        }
        return player1;
    }

    public static void trapTrigger() {


    }
}