public class Player extends Tile {

    String userName;
    int row;
    int col;
    int totalMoney;
    int moneyMade;
    int moneyToLoose;
    int moneyInvested = 0;
    public boolean canLooseAllMoneyMade;
    static boolean canPlayerPlaceTraps;
    static boolean canPlayerActivateSteal;
    static boolean nextChanceOnlyLoss;

    public Player(String userName){
        this.totalMoney = 1000;
        this.userName = userName;
        row = 3;
        col = 7;
        canPlayerActivateSteal = true;
        canLooseAllMoneyMade = false;
        canPlayerPlaceTraps = true;
        nextChanceOnlyLoss = false;




    }
    public int[] getPlayerCoordinates() {

        int[] coordinates = new int[2];
        coordinates[0] = this.row;
        coordinates[1] = this.col;

        return coordinates;
    }

    public void displayPlayerCoordinates() {

        System.out.println(this.userName + " е на ред " + getPlayerCoordinates()[0] + " и колонка " + getPlayerCoordinates()[1]);

    }

    public int[] setNextPos(int offset) {

        if(row == 3) {

            col -= offset;
        }
        if(row == 3 && col == 0) {
            row += offset;

        }
        if((row == 1 && col == 0) && offset == 2) {

            col += 1;
        }
        if(row == 0) {
            col += offset;

        }


        return getPlayerCoordinates();

    }

    @Override
    public void actionOnLanding(Player player) {

    }
}
