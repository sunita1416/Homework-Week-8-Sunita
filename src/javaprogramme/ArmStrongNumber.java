package javaprogramme;


//10. Write a program to input any number and check if it Armstrong number or not
//153 = (1*1*1)+(5*5*5)+(3*3*3)
//where:
//(1*1*1)=1
//(5*5*5)=125
//(3*3*3)=27
//So:
//1+125+27=153

import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int result = 0;
        int n = 0;

        // count number of digits using while loop
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // calculate sum of cubes using while loop and math.pow
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // check if number is Armstrong
        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}


