public class PartyHard extends Tile {

    public PartyHard(int row, int col) {

        this.row = row;
        this.col = col;
    }


    @Override
    public void actionOnLanding(Player player) {
        player.totalMoney -= 25;
    }
}
