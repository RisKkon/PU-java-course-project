import java.util.Scanner;

public class Invest extends Tile {

    public Invest(int row, int col) {

        this.row = row;
        this.col = col;
    }


    @Override
    public void actionOnLanding(Player player) {
        for (int i = 0; i < 3; i++) {


            Scanner scanner = new Scanner(System.in);
            printMenu();
            int input = scanner.nextInt();

            if (input == 1) {

                evel(player);
            } else if (input == 2) {
                bombsAwayl(player);
            } else if (input == 3) {
                maroders(player);
            } else if (input == 4) {
                clockWorkl(player);
            } else if (input == 5) {
                fatCat(player);
            } else if (input == 6) {
                macrosoft(player);
            } else if(input == 7) {

                break;
            } else {
                System.out.println("Невалиден вход");
                input = scanner.nextInt();
                i--;
            }
        }
    }

    public void printMenu() {

        System.out.println("Изберете компания, в която даи зинвестирате");
        System.out.println("1. Evel Co, мин. инв. - 500 кф. -0.2, рисков интервал - (-5/+100)");
        System.out.println("2. Bombs away,мин.инв - 400, кф. - 0.5, рисков интервал - (-10/+50)");
        System.out.println("3. Maroders united,мин.инв - 200, кф. - 2, рисков интервал - (-18/+50)");
        System.out.println("4. Clock Work Orange,мин.инв - 300, кф. - 0.5, рисков интервал - (-15/+35)");
        System.out.println("5. Fatcat incorporated,мин.инв - 100, кф. - 2.5, рисков интервал - (-25/+100)");
        System.out.println("6. Macrosoft,мин.инв - 50, кф. - 5.0, рисков интервал - (-20/+10)");
        System.out.println("7. Няма да инвестирам");
    }

    public void evel(Player player) {
        Dice dice = new Dice();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Колко искате да инвестирате");
        int input = scanner.nextInt();
        while (input < 500) {
            System.out.println("Тряпва да инвестирате по- голяма сума");
            input = scanner.nextInt();

        }
        player.moneyInvested += input;

        if (dice.rollDiceForInvestment(-5, 100) >= 0) {

            double benefit = input * 0.2;
            player.moneyMade += benefit;
        } else {

            player.moneyToLoose += input;
        }
    }

    public void bombsAwayl(Player player) {
        Dice dice = new Dice();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Колко искате да инвестирате");
        int input = scanner.nextInt();
        while (input < 400) {
            System.out.println("Тряпва да инвестирате по- голяма сума");
            input = scanner.nextInt();

        }
        player.moneyInvested += input;

        if (dice.rollDiceForInvestment(-10, 50) >= 0) {

            double benefit = input * 0.5;
            player.moneyMade += benefit;
        } else {

            player.moneyToLoose += input;
        }
    }
        public void clockWorkl(Player player) {
            Dice dice = new Dice();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Колко искате да инвестирате");
            int input = scanner.nextInt();
            while (input < 300) {
                System.out.println("Тряпва да инвестирате по- голяма сума");
                input = scanner.nextInt();

            }
            player.moneyInvested += input;

            if (dice.rollDiceForInvestment(-15, 35) >= 0) {

                double benefit = input * 1.5;
                player.moneyMade += benefit;
            } else {

                player.moneyToLoose += input;
            }
        }

        public void maroders(Player player) {
            Dice dice = new Dice();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Колко искате да инвестирате");
            int input = scanner.nextInt();
            while (input < 200) {
                System.out.println("Тряпва да инвестирате по- голяма сума");
                input = scanner.nextInt();

            }
            player.moneyInvested += input;

            if (dice.rollDiceForInvestment(-18, 50) >= 0) {

                double benefit = input * 2;
                player.moneyMade += benefit;
            } else {

                player.moneyToLoose += input;
            }

        }


        public void fatCat(Player player) {
            Dice dice = new Dice();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Колко искате да инвестирате");
            int input = scanner.nextInt();
            while (input < 100) {
                System.out.println("Тряпва да инвестирате по- голяма сума");
                input = scanner.nextInt();

            }
            player.moneyInvested += input;

            if (dice.rollDiceForInvestment(-25, 100) >= 0) {

                double benefit = input * 2.5;
                player.moneyMade += benefit;
            } else {

                player.moneyToLoose += input;
            }

        }
        public void macrosoft(Player player) {
            Dice dice = new Dice();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Колко искате да инвестирате");
            int input = scanner.nextInt();
            while (input < 50) {
                System.out.println("Тряпва да инвестирате по- голяма сума");
                input = scanner.nextInt();

            }
            player.moneyInvested += input;

            if (dice.rollDiceForInvestment(-20, 10) >= 0) {

                double benefit = input * 5;
                player.moneyMade += benefit;
            } else {

                player.moneyToLoose += input;
            }

        }

    }


