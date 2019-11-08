package hw1;

import java.util.Random;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Random random = new Random();
        int random1 = random.nextInt(100) + 1;
        int guessesList[] = new int[99999];
        int guess;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Let the game begin!");

        guess = sc.nextInt();
        guessesList[0] = guess;
        count++;
        while (true) {

            if (guess > random1) {
                System.out.println("Your number is too big. Please, try again.");
                guess = sc.nextInt();
                guessesList[count] = guess;
                count++;
            } else if (guess < random1) {
                System.out.println("Your number is too small. Please, try again.");
                guess = sc.nextInt();
                guessesList[count] = guess;
                count++;
            } else if (guess == random1) break;


        }
        System.out.println("Congratulations," + name + "!");
        System.out.println("Your guesses: ");
        for (int i = 0; i < count; i++) {
            System.out.print(guessesList[i] + " ");

        }
    }
}

