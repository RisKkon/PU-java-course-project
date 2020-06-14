import java.util.Scanner;

public class Trap extends Tile {

    int chosenTrap;
    static boolean isTrapActive = false;


    public Trap(int index) {
        this.index = index;


    }


    @Override
    public void actionOnLanding(Player player) {
        if(player.canPlayerPlaceTraps) {


            if (!isTrapActive) {
                printMenuForTrap();
                Scanner scanner = new Scanner(System.in);
                chosenTrap = scanner.nextInt();
                isTrapActive = true;
                if (chosenTrap == 1) {
                    player.moneyInvested += 100;
                }
                if (chosenTrap == 2) {
                    player.moneyInvested += 200;
                }
                if (chosenTrap == 3) {
                    player.moneyInvested += 100;
                }
                if (chosenTrap == 4) {
                    player.moneyInvested += 50;
                }
                if (chosenTrap == 5) {
                    player.moneyInvested += 100;
                }


            } else {

                if (chosenTrap == 1) {

                    trap1(player);
                }
                if (chosenTrap == 2) {
                    trap2(player);
                }
                if (chosenTrap == 3) {
                    trap3(player);
                }
                if (chosenTrap == 4) {
                    trap4(player);
                }
                if (chosenTrap == 5) {
                    trap5(player);
                }
                isTrapActive = false;
            }
        }
        if(!player.canPlayerPlaceTraps) {

            System.out.println("Не можеш да заложиш капан");
        }

    }



    public void printMenuForTrap() {

        System.out.println("Изберете какъв капан да заложите");
        System.out.println("1. Данъчна ревизия");
        System.out.println("2. Развод по котешки");
        System.out.println("3. Пропаганда");
        System.out.println("4. Проглеждане");
        System.out.println("5. Хазартен бос");
    }





    public void trap1(Player player) {
        player.moneyToLoose += (player.moneyMade - (player.moneyMade / 10));

    }

    public void trap2(Player player) {

        Dice dice = new Dice();
        int num = dice.rollDice(10);

        if(num == 8 || num == 2) {

            player.canLooseAllMoneyMade = true;
        }
    }

    public void trap3(Player player) {

        player.canPlayerPlaceTraps = false;

    }

    public void trap4(Player player) {

        player.canPlayerActivateSteal = false;
    }

    public void trap5(Player player) {

        player.nextChanceOnlyLoss = true;


    }
}
