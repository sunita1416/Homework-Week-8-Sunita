package javaprogramme;
//14. Write a program in Java to display the pattern like a diamond.
// While loop
// *
// ***
// *****
// *******
// *********
//***********
//*************
//***********
// *********
// *******
// *****
// ***
// *
import java.util.Scanner;


public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 7; // number of rows in the diamond

        // upper half of the diamond
        int a = 1;
        while (a <= rows) {
            int b = 1;
            while (b <= (rows - a)) {
                System.out.print(" ");
                b++;
            }
            b = 1;
            while (b <= (2 * a - 1)) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }

        // lower half of the diamond
        a = rows - 1;
        while (a >= 1) {
            int b = 1;
            while (b <= (rows - a)) {
                System.out.print(" ");
                b++;
            }
            b = 1;
            while (b <= (2 * a - 1)) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            a--;
        }
    }
}




