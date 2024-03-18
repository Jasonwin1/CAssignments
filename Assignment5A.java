/*Class: CSE 1321L
       Section: J51
       Term: Spring
       Instructor: Babu Yaganti
       Name: Jason Nguyen
       Lab#: Assignment5A
       */

import java.util.Scanner;
import java.util.Random;
public class Assignment5A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("How many games do you want to play?: ");
        int games = scan.nextInt();

        String [] choices = {"Rock", "Paper", "Scissors"};

        String[] result = new String [games];
        for (int i = 0; i < games; i++) {
            System.out.print("Round " + (i +1) + ": What do you want to throw?: ");
            String userChoice = scan.next();
            String computerChoices = "";

            int randNumber = rand.nextInt(3);

            if (randNumber == 0) {
                computerChoices = choices[0];
            }else if (randNumber == 1) {
                computerChoices = choices[1];
            }else{
                computerChoices = choices[2];
            }
            System.out.println("Computer threw " + computerChoices.toUpperCase() + "!");

            if (userChoice.equalsIgnoreCase(computerChoices) ) {
                result[i] = "Tied on Round " + (i + 1) + " with " + userChoice;
            }else if (userChoice.equalsIgnoreCase(choices[0]) && computerChoices.equalsIgnoreCase(choices[1])) {
                result[i] = "Computer won on Round " + (i + 1) + " with " + computerChoices;
            }else if (userChoice.equalsIgnoreCase(choices[0]) && computerChoices.equalsIgnoreCase(choices[2])) {
                result[i] = "Player won on Round " + (i + 1) + " with " + userChoice;
            }else if (userChoice.equalsIgnoreCase(choices[1]) && computerChoices.equalsIgnoreCase(choices[0])) {
                result[i] = "Player won on Round " + (i + 1) + " with " + userChoice;
            }else if (userChoice.equalsIgnoreCase(choices[1]) && computerChoices.equalsIgnoreCase(choices[2])) {
                result [i] = "Computer won on Round " + (i + 1) + " with " + computerChoices;
            }else if (userChoice.equalsIgnoreCase(choices[2]) && computerChoices.equalsIgnoreCase(choices[0])) {
                result[i] = "Computer won on Round " + (i + 1) + " with " + computerChoices;
            }else if (userChoice.equalsIgnoreCase(choices[2]) && computerChoices.equalsIgnoreCase(choices[1])) {
                result[i] = "Player won on Round " + (i + 1) + " with " + userChoice;
        }

        }
        System.out.println("Game over...");
        System.out.println();
        System.out.println("Here's the recap: ");
        for (int j = 0; j < games; j++) {
            System.out.println(result[j]);

        }


    }
}