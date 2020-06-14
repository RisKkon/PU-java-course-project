public class Player extends Tile {

    String userName;
    int totalMoney;
    int moneyMade;
    int moneyToLoose;
    int moneyInvested;
    public boolean canLooseAllMoneyMade;
    boolean canPlayerPlaceTraps;
    boolean canPlayerActivateSteal;
    boolean nextChanceOnlyLoss;
    static int isStealBonusActive;
    int stealBonusIndex;

    public Player(String userName){
        this.totalMoney = 1000;
        this.userName = userName;
        this.index = 0;
        this.stealBonusIndex = 0;
        this.moneyInvested = 0;
        canPlayerActivateSteal = true;
        canLooseAllMoneyMade = false;
        canPlayerPlaceTraps = true;
        nextChanceOnlyLoss = false;
        isStealBonusActive = 1;




    }
    public int getPlayerCoordinate() {


        return index;
    }

    public void displayPlayerCoordinatesAndMoney() {
        System.out.println("Всички пари на " + this.userName + ":" + this.totalMoney);
        System.out.println("Инвестирани пари на " + this.userName + ":" + this.moneyInvested);

        System.out.println(this.userName + " е на ред " + (convertIndexToRowAndCol()[0] + 1) + " и колонка " + (convertIndexToRowAndCol()[1] + 1));
    }

    public int setNextPos(int offset) {

        if(this.index <= 20) {

            this.index += offset;
        }
        if(this.index == 20) {
            this.index -= 20;
        }
        return getPlayerCoordinate();
    }


    public int[] convertIndexToRowAndCol() {

        int[] coordinates = new int[2];
        if (index == 0) {

            coordinates[0] = 3;
            coordinates[1] = 7;
        }
        if (index == 1) {

            coordinates[0] = 3;
            coordinates[1] = 6;
        }
        if (index == 2) {

            coordinates[0] = 3;
            coordinates[1] = 5;
        }
        if (index == 3) {

            coordinates[0] = 3;
            coordinates[1] = 4;
        }
        if (index == 4) {

            coordinates[0] = 3;
            coordinates[1] = 3;
        }
        if (index == 5) {

            coordinates[0] = 3;
            coordinates[1] = 2;
        }
        if (index == 6) {

            coordinates[0] = 3;
            coordinates[1] = 1;
        }
        if (index == 7) {

            coordinates[0] = 3;
        }
        if (index == 8) {

            coordinates[0] = 2;

        }
        if (index == 9) {

            coordinates[0] = 1;

        }
        if (index == 11) {


            coordinates[1] = 1;
        }
        if (index == 12) {


            coordinates[1] = 2;
        }
        if (index == 13) {


            coordinates[1] = 3;
        }
        if (index == 14) {


            coordinates[1] = 4;
        }
        if (index == 15) {


            coordinates[1] = 5;
        }
        if (index == 16) {


            coordinates[1] = 6;
        }
        if (index == 17) {


            coordinates[1] = 7;
        }
        if (index == 18) {

            coordinates[0] = 1;
            coordinates[1] = 7;
        }
        if (index == 19) {

            coordinates[0] = 2;
            coordinates[1] = 7;
        }
        if (index == 20) {

            coordinates[0] = 3;
            coordinates[1] = 7;
        }

        return coordinates;
    }


    public boolean isStealBonusActive() {

        if(isStealBonusActive == 1) {
            isStealBonusActive = 2;
            return false;
        } else {
            return true;
        }
    }



    @Override
    public void actionOnLanding(Player player) {


    }
}
