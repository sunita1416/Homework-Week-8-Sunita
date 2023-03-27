package javaprogramme;


//13. Shared Digit
//Write a method named hasSharedDigit with two parameters of type int.
//Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
//within the range, the method should return false.
//The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
//otherwise, the method should return false.
//EXAMPLE INPUT/OUTPUT:
//* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
//NOTE: The method hasSharedDigit should be defined as public static


public class SharedDigit {
    public static void main(String[] args) {
        //create two int parameters
                int num1 = 12;
        int num2 = 23;
        boolean result = hasSharedDigit(num1, num2); //assign the boolean for result matches the requirement
        System.out.println(num1 + " and " + num2 + " share a digit: " + result);

        num1 = 9;
        num2 = 99;
        result = hasSharedDigit(num1, num2);
        System.out.println(num1 + " and " + num2 + " share a digit: " + result);

        num1 = 15;
        num2 = 55;
        result = hasSharedDigit(num1, num2);
        System.out.println(num1 + " and " + num2 + " share a digit: " + result);
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) { //Each number should be within the range of 10 -99
            return false;                                           // if condition not matches with above then result
                                                                    // should be false
        }
        while (num1 > 0) {
            int digit1 = num1 % 10;
            int temp = num2;
            while (temp > 0) {
                int digit2 = temp % 10;
                if (digit1 == digit2) {
                    return true;
                }
                temp /= 10;
            }
            num1 /= 10;
        }
        return false;
    }
}

