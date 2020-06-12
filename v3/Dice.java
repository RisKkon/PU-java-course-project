

public class Dice {

    int diceSize;





    public int rollDice(int diceSize) {

        return (int) ((Math.random() * ((diceSize + 1) - 1) + 1));
    }
}

