/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //Necessary Variable
        Scanner input = new Scanner(System.in);
        int givenTemp, newTemp;
        String choice;

        //Intro message
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit");

        //Selection
        choice = input.next();

        if (choice.equals("C"))
        {
            //Confirmation
            System.out.println("Your choice: C");
            System.out.println("Please enter the temperature in Fahrenheit:");
            givenTemp = input.nextInt();

            //Calculation
            newTemp = (givenTemp - 32) * (5 / 9);

            //Output
            System.out.println("The temperate in Celsius is: " + newTemp);
        }
        else
        {
            //Confirmation
            System.out.println("Your choice: F");
            System.out.println("Please enter the temperature in Celsius:");
            givenTemp = input.nextInt();

            //Calculation
            newTemp = (givenTemp * 9 / 5) + 32;

            //Output
            System.out.println("The temperate in Fahrenheit is: " + newTemp);
        }


    }
}
