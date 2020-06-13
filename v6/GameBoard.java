

public class GameBoard {

    int size = 20;
    Tile[] gameBoard;

    public void setGameBoard() {

        gameBoard = new Tile[size];
        gameBoard[0] = new Start(0);
        gameBoard[1] = new Trap(1);
        gameBoard[2] = new Trap(2);
        gameBoard[3] = new Trap(3);
        gameBoard[4] = new Invest(4);
        gameBoard[5] = new PartyHard(5);
        gameBoard[6] = new Trap(6);
        gameBoard[7] = new Chance(7);
        gameBoard[8] = new Steal(8);
        gameBoard[9] = new Trap(9);
        gameBoard[10] = new Chance(10);
        gameBoard[11] = new Invest(11);
        gameBoard[12] = new Trap(12);
        gameBoard[13] = new PartyHard(13);
        gameBoard[14] = new Steal(14);
        gameBoard[15] = new Trap(15);
        gameBoard[16] = new PartyHard(16);
        gameBoard[17] = new Chance(17);
        gameBoard[18] = new Invest(18);
        gameBoard[19] = new Steal(19);;

    }



    public void displayGameBoard() {

        System.out.println("  ===============================================");
        System.out.println("1 | C | | I | | T | | PH | | S | | T | | PH | C |");
        System.out.println("2 | T |                                     | I |");
        System.out.println("3 | S |                                     | S |");
        System.out.println("4 | C | | T | | PH| | I  | | T | | T | | T  |Str|");
        System.out.println("  ===============================================");
        System.out.println("    1     2     3      4     5     6     7    8 ");

    }



    public void onLand(Player player) {

        gameBoard[player.index].actionOnLanding(player);
    }
}
