package javaprogramme;
//12. Write a programme to input any number and check if it is prime or not.
//(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
//prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
//17.... are the prime numbers.)

import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        //take an integer input from Scanner class.
        //then initialize a boolean variable isPrime to true
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = true;

        if (num <= 1) {                   //check if the input number is less than or equal to 1, as all prime number
                                          // is greater than 1
            isPrime = false;              //if input number is less than or equal to 1, we set 'isPrime' to false
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {  //loop through all the integer from 2 to the square root of
                                                     // the input number.
            if (num % i == 0) {                      // if the input number is divisible by any of these integers, it's
                                                     // not a prime number, so we set 'isPrime to false and break out the
                                                     // loop
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number."); //check the value of 'isPrime and print message for is input
                                                             // number is prime number or not
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}


