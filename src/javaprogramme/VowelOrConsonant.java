package javaprogramme;

//3. Write a Java program that takes the user to provide a single character from the
// alphabet. Print Vowel of Consonant, depending on the user input. If the user input
// Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
//error message.
//For eg:
// Input an alphabet: p
// Expected Output:
// Input letter is Consonant

import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        //use Scanner to get input from user. then convert the input o lowercase using the toLowerCase()
        // to compare it to lowercase letters

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = scanner.next().toLowerCase();

        //check if the input is a single character from the alphabet by checking its length is 1 and it is a letter
        //using Character.isLetter() method

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {

            System.out.println("Error: Please input a single character from the alphabet.");
        } else {
            char ch = input.charAt(0);

            //if the input its valid, we check if the character is a vowel o consonant.
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }
    }
}



