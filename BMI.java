package bmi;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        System.out.print("Enter weight in pounds: \t");

        Scanner input = new Scanner(System.in);

        //Prompt the user to get value in pounds.
        double weight = input.nextDouble();

        System.out.print("\nEnter height in inches: \t");

        //Prompt the user to get value in inches.
        double height = input.nextDouble();

        double result = (weight * 0.45359237) / Math.pow(height * 0.0254, 2);

        String message = String.format("\nBMI is %f", result);

        if (result < 18.5) {
            System.out.println(message + "(Underweight!)");

        } else if (result >= 18.5 && result <= 24.9) {
            System.out.println(message + "(Normal!)");

        } else if (result >= 25 && result <= 29.9) {

            System.out.println(message + "(Overweight!)");

        } else if (result >= 30 && result <= 34.9) {

            System.out.println(message + "(Obesity(1)!)");

        } else if (result >= 35 && result <= 39.9) {

            System.out.println(message + "(Obesity(2)!)");

        } else if (result >= 40) {

            System.out.println(message + "(Obesity(3)!)");

        }

    }

}
