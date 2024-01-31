// displaying all digits of a number

import java.util.Scanner;

public class displayDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a number:");
        int n = scan.nextInt();

        while (n > 0) {
            int digit = (int) n % 10;
            System.out.println(digit);

            n = n / 10;
        }

        scan.close();
    }
}
