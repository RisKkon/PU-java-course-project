public class PartyHard extends Tile {

    public PartyHard(int index) {

        this.index = index;
    }


    @Override
    public void actionOnLanding(Player player) {
        player.totalMoney -= 25;
    }
}
