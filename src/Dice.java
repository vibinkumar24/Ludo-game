import java.util.Random;
import java.util.Scanner;

class Dice {
    public int roll() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Press enter to roll the dice");
        scanner.nextLine();
        return random.nextInt(6) + 1;
    }
}