// summing natural numbers

import java.util.Scanner;

public class naturalNumbersSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose how many natural numbers you want to add? Starting from 1.");
        int number = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        scan.close();
        System.out.println(sum);
    }
}
