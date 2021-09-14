/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 beden chew
 */
import java.util.Scanner;
public class exerciseEighteen {

    public static void main(String arg[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter unit (C=Fahrenheit to Celsius, F=Celsius to Fahrenheight):");
        char unit = input.next().charAt(0);


        if (unit == 'C' || unit== 'c') {

            System.out.print("Enter Fahrenheit temperature to be converted ");
            double fahrenheight = input.nextDouble();
            double fahrenheighttoCelcius = (fahrenheight - 32) * 5 / 9;
            System.out.println("Celsius temperature is now " + fahrenheighttoCelcius);


        } else if (unit == 'F'|| unit=='f' ) {

            System.out.println("Enter Celsius temperature to be converted ");
            double celsius = input.nextDouble();
            double celsiustoFahrenheight = ((celsius * 9) / 5) + 32;
            System.out.println("Fahrenheit temperature is now " + celsiustoFahrenheight);

        } else {
            System.out.println("Please only select F or C");
        }
    }
}