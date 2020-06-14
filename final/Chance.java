import java.util.Scanner;

public class Chance extends Tile {

    public Chance(int index) {

        this.index = index;
    }


    @Override
    public void actionOnLanding(Player player) {
        stealBonus(player.stealBonusIndex, player);
        Dice dice = new Dice();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Натисни 1 за да хвърлиш зар");
        int input = scanner.nextInt();
        int dice1;

        if(!player.nextChanceOnlyLoss) {
            dice1 = dice.rollDice(10);
            player.nextChanceOnlyLoss = false;
        } else {
            dice1 = 1;
        }

        while(input != 1) {

            System.out.println("Трябва да натиснеш 1 за да хвърлиш зарът...");
            input = scanner.nextInt();

        }
        if(dice1 % 2 == 0) {

            System.out.println("Шансът е положителен");
            int diceNum = dice.rollDiceForInvestment(1, 100);

            if(diceNum <= 39) {
                player.moneyMade += 50;
                System.out.println("+50");
            }
            if(diceNum >= 40 && diceNum <= 64) {
                player.moneyMade += 100;
                System.out.println("+100");
            }
            if(diceNum >= 65 && diceNum <=79) {
                player.moneyMade += 150;
                System.out.println("+150");
            }
            if(diceNum >= 80 && diceNum <= 94) {
                player.moneyMade += 200;
                System.out.println("+200");
            }
            if(diceNum >= 95) {
                player.moneyMade += 250;
                System.out.println("+250");
            }

        }
        if(dice1 % 2 != 0) {

            System.out.println("Шансът е отрицателен");
            int diceNum = dice.rollDiceForInvestment(1, 100);

            if(diceNum <= 39) {
                player.moneyToLoose += 50;
                System.out.println("-50");
            }
            if(diceNum >= 40 && diceNum <= 64) {
                player.moneyToLoose += 100;
                System.out.println("-100");
            }
            if(diceNum >= 65 && diceNum <=79) {
                player.moneyToLoose += 150;
                System.out.println("-150");
            }
            if(diceNum >= 80 && diceNum <= 94) {
                player.moneyToLoose += 200;
                System.out.println("-200");
            }
            if(diceNum >= 95) {
                player.moneyToLoose += 250;
                System.out.println("-250");
            }
        }

    }

    public void stealBonus(int index, Player player) {

        if(player.isStealBonusActive() && index == 1) {

            player.moneyMade += 100;
            System.out.println("+100 парички(Steal бонус)");
        }
    }
}
