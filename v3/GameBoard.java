

public class GameBoard {

    int rows = 4;
    int cols = 8;
    Tile[][] gameBoard;

    public Tile[][] getGameBoard() {

        gameBoard = new Tile[rows][cols];
        gameBoard[3][7] = new Start(3, 7);
        gameBoard[3][6] = new Trap(3, 6);
        gameBoard[3][5] = new Trap(3, 5);
        gameBoard[3][4] = new Trap(3, 4);
        gameBoard[3][3] = new Invest(3, 3);
        gameBoard[3][2] = new PartyHard(3, 2);
        gameBoard[3][1] = new Trap(3, 1);
        gameBoard[3][0] = new Chance(3, 0);
        gameBoard[2][0] = new Steal(2, 0);
        gameBoard[1][0] = new Trap(1, 0);
        gameBoard[0][0] = new Chance(0, 0);
        gameBoard[0][1] = new Invest(0, 1);
        gameBoard[0][2] = new Trap(0, 2);
        gameBoard[0][3] = new PartyHard(0, 3);
        gameBoard[0][4] = new Steal(0, 4);
        gameBoard[0][5] = new Trap(0, 5);
        gameBoard[0][6] = new PartyHard(0, 6);
        gameBoard[0][7] = new Chance(0, 7);
        gameBoard[1][7] = new Invest(1, 7);
        gameBoard[2][7] = new Steal(2, 7);;

        return gameBoard;
    }



    public void displayGameBoard() {

        for(int row = 0; row < getGameBoard().length; row++) {

            for(int col = 0; col < getGameBoard()[row].length; col++) {
                if(gameBoard[row][col] == null) {
                    System.out.print("      ");

                }
                else if(gameBoard[row][col].getClass() == PartyHard.class) {
                    System.out.print("| PH | ");
                }
                else if(gameBoard[row][col].getClass() == Start.class) {
                    System.out.print("| Str| ");

                }
                else if(gameBoard[row][col].getClass() == Trap.class) {
                    System.out.print("| T | " );
                }
                else if(gameBoard[row][col].getClass() == Invest.class) {
                    if(row == 1 && col == 7) {
                        System.out.print("  | I |");
                    }else {
                        System.out.print("| I | ");
                    }
                }
                else if(gameBoard[row][col].getClass() == Steal.class) {
                    if(row == 2 && col == 7) {
                        System.out.print("  | S |");
                    } else {
                        System.out.print("| S | ");
                    }
                }
                else {
                    System.out.print("| C | ");

                }
            }

            System.out.println();

            System.out.println("=================================================");

        }

    }

    public void onLand(Player player) {

        gameBoard[player.row][player.col].actionOnLanding(player);
    }
}
