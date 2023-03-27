package javaprogramme;
//1. Read 10 numbers from the console entered by the user and print the sum of those
//numbers.


import java.util.Scanner;
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create scanner object to read input from console.

        //create variables
        int count = 1;
        int sum = 0;

        //using while loop we check if he input entered by user is an integer, used hasNextInt()

        while (count <=10) {
            System.out.println("Enter number #" + count + ": ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt(); //read integer using the nextInt() method and add it to the sum.
                sum += number;
                count++;
                //If the input is not an integer, we print 'invalid number' message by using next() method
            } else {
                System.out.println("Invalid Number");
                scanner.next();// clear the invalid input from scanner
            }
        }
        System.out.println("The sum of 10 numbers is: " + sum); //close scanner
        scanner.close();
    }
}
