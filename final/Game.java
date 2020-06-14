import java.util.Scanner;

public class Game {



    public static void main(String[] args) {

        Scanner scanner     = new Scanner(System.in);
        GameBoard gameBoard = new GameBoard();
        int currentPlayerId = 1;
        System.out.println("Въведете име за играч N1");
        Player player1      = new Player(scanner.nextLine());
        System.out.println("Въведете име за играч N2");
        Player player2      = new Player(scanner.nextLine());
        Dice dice           = new Dice();
        gameBoard.setGameBoard();


        while (isGameRunning(player1, player2)) {
            int offset = 0;
            gameBoard.setStealBonus(player1, player2);
            gameBoard.displayGameBoard();
            currentPlayer(currentPlayerId, player1, player2).displayPlayerCoordinatesAndMoney();
            System.out.println("Натисни 1 за да хвърлиш зар");
            int input = scanner.nextInt();
            if(input == 1) {
                offset = dice.rollDice(1);

            }
            currentPlayer(currentPlayerId, player1, player2).setNextPos(offset);
            gameBoard.onLand(currentPlayer(currentPlayerId, player1, player2));
            currentPlayer(currentPlayerId, player1, player2).displayPlayerCoordinatesAndMoney();
            currentPlayerId++;

        }

    }

    public static Player currentPlayer(int currentPlayerId, Player player1, Player player2) {


        if(currentPlayerId % 2 != 0) {

            return player1;
        }
        return player2;
    }

    public static boolean isGameRunning(Player player1, Player player2) {

        return player1.totalMoney > 0 && player2.totalMoney > 0;

    }

}