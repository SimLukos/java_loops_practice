// reversing a number

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose number to reverse it:");
        int number = scan.nextInt();
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);

            reversed = reversed * 10 + digit;

            number = number / 10;
        }

        System.out.println("Reversed: " + reversed);

        scan.close();
    }
}
