public class Player extends Tile {

    String userName;
    int row;
    int col;
    int money;
    int moneyMade;
    int moneyToLoose;
    int moneyInvested = 0;
    static boolean isGoingToLooseAllMoneyMade = false;

    static boolean canPlayerPlaceTraps = true;
    static boolean canPlayerActivateSteal = true;

    public Player(String userName){
        this.money = 1000;
        this.userName = userName;
        row = 3;
        col = 7;



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

            col = col - offset;
        }

        return getPlayerCoordinates();

    }

    @Override
    public void actionOnLanding(Player player) {

    }
}
