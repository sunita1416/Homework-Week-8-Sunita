package javaprogramme;


//11. Even Digit Sum
//Write a method named getEvenDigitSum with one parameter of type int called number.
//The method should return the sum of the even digits within the number.
//If the number is negative, the method should return -1 to indicate an invalid value.
//EXAMPLE INPUT/OUTPUT:
//* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
//* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
//* getEvenDigitSum(-22); → should return -1 since the number is negative
//NOTE: The method getEvenDigitSum should be defined as public static


public class EvenDigitSum {
    //use integer parameter number and return sum of the even digit within the number
    //if number is negative, it returns -1
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        //if the number is positive, we initialize a variable sum to 0, and iterate through each digit in the number
        //using a while loop

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); // should return 20
        System.out.println(getEvenDigitSum(252)); // should return 4
        System.out.println(getEvenDigitSum(-22)); // should return -1
    }
}

