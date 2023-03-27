package javaprogramme;
//8. Display right angle triangle of @ using nested for loops
// @
// @@
// @@@
// @@@@
// @@@@@
public class RightAngleTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // outer loop for rows
            for (int j = 1; j <= i; j++) { // inner loop for columns
                System.out.print("@");
            }
            System.out.println(); // move to next line after printing each row
        }
    }
    }

