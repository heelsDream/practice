package testCode;

/**
 * Created by flyboy on 12/24/2016.
 */

import java.util.Scanner;

public class TestMail {
    /**
     * This is the main function for execuation
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Type your name here: ");
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        String lastName = input.next();
        System.out.printf("First name is: %s; Last name is: %s", firstName, lastName);
    }
}
