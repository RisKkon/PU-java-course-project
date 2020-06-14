public class Steal extends Tile{

    static boolean isStealActivated = true;

    public Steal(int index) {

        this.index = index;
    }


    @Override
    public void actionOnLanding(Player player) {
        if(player.canPlayerActivateSteal) {

            if (isStealActivated) {


                if (player.isStealBonusActive()) {

                    stealBonus(player.stealBonusIndex, player);
                    isStealActivated = true;
                }
            }
            if (!isStealActivated) {

                System.out.println("Този steal е вече активиран");
            }
        }

        if(!player.canPlayerActivateSteal) {
            System.out.println("Не можете да активирате steal");
        }
    }


    public void stealBonus(int index, Player player) {

        if(player.isStealBonusActive() && index == 3) {

            player.totalMoney += 100;
            System.out.println("+100 парички(Steal бонус)");

        }
    }

}
