package javaprogramme;
//2. -Read the numbers from the console entered by the user and print the minimum
//and maximum number the user has entered.
//-Before the user enters the number, print the message Enter number:
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum
//number.
//Hint:
//-Use an endless while loop.
//-Create a class with the name MinAndMaxInputChallenge.

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create scanner object to read input from the console.
        int min = Integer.MAX_VALUE;              // initialize min to maximum interger value and max to minimum inter value
        int max = Integer.MIN_VALUE;

        while (true) {                           //use while loop to repeatedly prompt user to enter a number
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {          //use hasNextInt to check if the user has entered an int value
                                                 //if so, we read the number using the nextIn() method.
                int number = scanner.nextInt();
                if (number < min) {              // if number entered by user is less than the current min value,
                                                 // we update min to the new value
                    min = number;
                }
                if (number > max) {             //if number entered greater than the current max value, we update,
                                                //max to the new value
                    max = number;
                }
            } else {                           //if user enters an invalid input, we break out of the loop
                break;
            }
        }

        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
    }
}



