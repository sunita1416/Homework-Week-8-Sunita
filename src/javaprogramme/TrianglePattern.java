package javaprogramme;

//6. Write a program in Java to display the pattern like a triangle with a number.
// For e.g.
// Input number of rows: 10
// Expected Output:
// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1234567
// 12345678
// 123456789
// 12345678910

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                  //import Scanner to read input from the user
        System.out.print("Enter the number of rows: ");       //user to enter number of rows they want in the pattern
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {                    //use nested 'for' loop to iterate through the rows,
                                                             // and the inner loop iterates through the columns.
            int num = 1;                                     //Initialize a variable num = 1, which is starting number of each row.
            for (int j = 1; j <= i; j++) {                   //print current value of num and then increment it.
                System.out.print(num + " ");                 //print numbers for the current row, and next line for next row.
                num++;
            }
            System.out.println();
        }
    }
}
