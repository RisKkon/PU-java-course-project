public class Start extends Tile {

    public Start(int index) {

        this.index = index;

    }


    @Override
    public void actionOnLanding(Player player) {

        if(player.canLooseAllMoneyMade) {
            Dice dice = new Dice();
            int num = dice.rollDice(10);
            if(num == 2 || num == 10) {

                player.moneyMade = 0;
            }

        }
        player.moneyMade -= player.moneyToLoose;
        player.totalMoney += player.moneyMade;
        player.moneyMade = 0;
        player.moneyInvested = 0;
        player.canLooseAllMoneyMade = false;
        player.nextChanceOnlyLoss = false;
        player.moneyToLoose = 0;
        player.canPlayerActivateSteal = true;
        player.canPlayerPlaceTraps = true;
        player.stealBonusIndex = 1;

    }
}
