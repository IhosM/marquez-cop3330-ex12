/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise12;

import java.util.Scanner;

public class Solution12
{
    public static void main(String args[])
    {

        System.out.print("Enter the principal: ");
        Scanner scan = new Scanner(System.in);

        double principal = scan.nextDouble();
        System.out.print("Enter the rate of interest: ");

        double rate = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();


        int worth = (int) Math.round(principal * (1 + rate * years * 0.01));
        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth $" + worth + ".");

    }
}
