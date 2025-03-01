import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int die1 = 0;
        int die2 = 0;
        int cRoll = 0;
        String Play = "";
        boolean done = false;
            while (!done) {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                cRoll = die1 + die2;
                System.out.println("Roll the dice: ");
                    if (cRoll == 2 || cRoll == 3 || cRoll == 12) {
                        System.out.println("With the first dice being " + die1 + " and the second die being " + die2 + " the sum will be " + cRoll + " which means you are crapping out.");
                    } else if (cRoll == 7 || cRoll == 11) {
                        System.out.println("With the first dice being " + die1 + " and the second die being " + die2 + " the sum will be " + cRoll + " which means you are a natural!");
                    } else {
                        System.out.println("With the first dice being " + die1 + " and the second die being " + die2 + " the sum will be " + cRoll + " which means you need to roll again!");
                    }
                System.out.println("Do you want to play again? If Yes then type Y, if No then type N: ");
                    Play = in.nextLine();
                    if (Play.equals ("Y")) {
                        done = false;
                    }else if (Play.equals ("N")) {
                        done = true;
                    }
            }
    }
}