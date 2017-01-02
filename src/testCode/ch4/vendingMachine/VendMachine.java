package testCode.ch4.vendingMachine;

/**
 * @author: Created by pingjiex on 12/28/16.
 */

import java.util.Scanner;

public class VendMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // receive bill for payment
        System.out.print("Please insert your bill value in pennies: ");
        int billValue = input.nextInt();

        // choose your item to purchase
        System.out.print("The price (in pennies) of item to purchase: ");
        int itemPrice = input.nextInt();

        // define some constants
        final int PENNY_PER_DOLLAR = 100;
        final int PENNY_PER_QUATER = 25;

        // compute changes
        int changeDue = billValue - itemPrice;
        int dollarCoins = changeDue / PENNY_PER_DOLLAR;
        int quaters = (changeDue % PENNY_PER_DOLLAR) / PENNY_PER_QUATER;

        // display changes
        System.out.printf("change due is %d dollor coins and %5d quaters", dollarCoins, quaters);
    }
}
