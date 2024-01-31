// display multiplication table

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose number for multiplication table:");
        int number = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;

            System.out.println(number + " x " + i + " = " + result);
        }

        scan.close();
    }
}
