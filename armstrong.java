// finding a number is Armstrong or not

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose number to check if it is Armstrong or not:");
        int number = scan.nextInt();
        long numberToPrint = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            sum = sum + (digit * digit * digit);

            number = number / 10;
        }

        if (sum == numberToPrint) {
            System.out.println("Number " + numberToPrint + " IS Armstrong number.");
        } else {
            System.out.println("Number " + numberToPrint + " is NOT Armstrong number.");
        }

        scan.close();
    }
}
