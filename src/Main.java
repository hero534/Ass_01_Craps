import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int die1 = 0;
        int die2 = 0;
        int cRoll = 0;
        int point = 0;
        String Play = "Y";
            while (Play.equals ("Y")) {
                System.out.println("Press enter to roll the dice...");
                in.nextLine();
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    cRoll = die1 + die2;
                    System.out.println("You rolled " + die1 + " + " + die2 + " to equal " + cRoll);
                        if (cRoll == 2 || cRoll == 3 || cRoll == 12) {
                            System.out.println("Craps, You lose.");
                        } else if (cRoll == 7 || cRoll == 11) {
                            System.out.println("You're a natural, You win!");
                        } else {
                            point = cRoll;
                            System.out.println("Point is set to " + point);
                                while (true) {
                                    die1 = rnd.nextInt(6) + 1;
                                    die2 = rnd.nextInt(6) + 1;
                                    cRoll = die1 + die2;
                                    System.out.println("Press enter to roll again...");
                                    in.nextLine();
                                        if (cRoll == point) {
                                            System.out.println("You win!");
                                            point = 0;
                                            break;
                                        }else if (cRoll == 7) {
                                            System.out.println("You rolled a 7! You lose.");
                                            point = 0;
                                            break;
                                        }
                                }
                        }
                    System.out.println("Do you want to play again? If Yes then type Y, if No then type N: ");
                        Play = in.nextLine();
            }
            in.close();
    }
}