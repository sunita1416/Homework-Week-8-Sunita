package javaprogramme;

//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class FibonacciNumber {
    public static void main(String[] args) {

        //initialize first two numbers of the sequence as n1, n2 and print them
        int n1 = 1, n2 = 1, n3;
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < 8; i++) {   //use for loop to calculate and print the next six numbers in sequence
            n3 = n1 + n2;
            System.out.print(" " + n3); // in each iteration of the loop, we calculate n3 as the sum of the previous
                                        // two numbers n1 and n2
                                       // loop runs 6 iteration as we printed first two numbers already.
            n1 = n2;
            n2 = n3;
        }
    }
}

