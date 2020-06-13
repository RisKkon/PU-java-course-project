

public class Dice {

    int diceSize;





    public int rollDice(int diceSize) {

        return (int) ((Math.random() * ((diceSize + 1) - 1) + 1));
    }


    public int rollDiceForInvestment(int diceMin, int diceMax) {

       return (int) ((Math.random() * (diceMax - diceMin) - diceMin));

    }
}

