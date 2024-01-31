// program generating Fibonacci series

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers in Fibonacci Series do you want?");
        int n = scan.nextInt();

        int a = 0, b = 1;
        System.err.print(a + ", " + b + ", ");

        for (int i = 0; i < n; i++) {
            int c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }

        scan.close();
    }
}
